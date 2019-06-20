package com.edu.gdpt.xxgcx.train.Widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;

import java.util.ArrayList;

public class SyncHScrollView extends HorizontalScrollView {
    private ItemObserverable itemObserverable=new ItemObserverable();
    private int mPosition=-1;
    private View mItemView;
    private OnItemClickListener mOnItemClickListener;
    private int mNormalColor=getDrawingCacheBackgroundColor();
    private int mSelectColor= Color.YELLOW;

    private float mStartX;
    private float mStartY;


    public SyncHScrollView(Context context) {
        super(context);
    }

    public SyncHScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SyncHScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    public void setNormalColor(int normalColor){
        mNormalColor=normalColor;
    }
    public void setSelectColor(int selectColor){
        mSelectColor=selectColor;
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        if (itemObserverable !=null){
            itemObserverable.notifiItemView(l,t,oldl,oldt);
        }
    }
    //点击监听
    public synchronized void onTouchEvent(View view, int position, MotionEvent event){
        if (mItemView == null || position == -1){
            mItemView=view;
            mPosition=position;
            onTouchEvent(event);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        super.onTouchEvent(ev);
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                mStartX=ev.getX();
                mStartY=ev.getY();
                postDelayed(mMoveActive,200);
                break;
            case MotionEvent.ACTION_MOVE:
                actionMove(ev);
                break;
            case MotionEvent.ACTION_UP:
            case MotionEvent.ACTION_CANCEL:
                actionUp(ev);
                mStartX=0;
                mStartY=0;
                break;
            default:
                break;
        }
        return false;
    }

    private void actionMove(MotionEvent ev) {
        float x =ev.getX();
        float y =ev.getY();
        float dy=Math.abs(y-mStartY);
        float dx=Math.abs(x-mStartX);
        if (dx>50||dy>0){
            if (mItemView!=null){
                mItemView.setBackgroundColor(mNormalColor);
                removeCallbacks(mMoveActive);
            }
        }
    }
    private void actionUp(MotionEvent ev){
        removeCallbacks(mMoveActive);
        float x=ev.getX();
        float y=ev.getY();
        float dx=Math.abs(x-mStartX);
        float dy=Math.abs(y-mStartY);
        if (dx<50&&dy<50){
            if (mPosition !=-1 && mItemView!=null){
                mItemView.setBackgroundColor(mSelectColor);
                postDelayed(mUpAction,50);
                if (mOnItemClickListener !=null){
                    mOnItemClickListener.onClick(mItemView,mPosition);
                }
            }
        }else {
            if (mItemView !=null){
                mItemView.setBackgroundColor(mNormalColor);
            }
            mPosition=-1;
            mItemView=null;
        }
    }


    Runnable mUpAction=new Runnable() {
        @Override
        public void run() {
            if (mItemView !=null){
                mItemView.setBackgroundColor(mNormalColor);
                mPosition=-1;
                mItemView=null;
                removeCallbacks(mUpAction);

            }
        }
    };
    Runnable mMoveActive=new Runnable() {
        @Override
        public void run() {
            if (mItemView !=null){
                mItemView.setBackgroundColor(mSelectColor);
            }
        }
    };
    //点击监听
    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        mOnItemClickListener=onItemClickListener;
    }
    //滚动监听
    public void setOnScrollListener(OnItemScrollView listener){
        if (itemObserverable !=null){
            itemObserverable.setListener(listener);
        }
    }

    public class ItemObserverable {
        private final ArrayList<OnItemScrollView> itemScrollViews;

        public ItemObserverable() {
            itemScrollViews=new ArrayList<>();
        }
        private void setListener(OnItemScrollView listener){
            itemScrollViews.add(listener);
        }
        private void notifiItemView(int l,int t,int oldl,int oldt){
            if (itemScrollViews !=null){
                for (OnItemScrollView itemScrollView : itemScrollViews){
                    itemScrollView.OnScroll(l,t,oldl,oldt);
                }
            }
        }
    }
    public interface OnItemClickListener{
        void onClick(View view,int position);
    }
    public interface OnItemScrollView {
        void OnScroll(int l,int t,int oldl,int oldt);

    }
}
