package com.edu.gdpt.xxgcx.train.Bean;

import java.util.List;

public class TicketBean {

    /**
     * status : 0
     * msg : ok
     * result : {"start":"杭州","end":"北京","date":"2019-06-26","list":[{"trainno":"G34","trainno12306":"5600000G3490","departstation":"杭州东","terminalstation":"北京南","departstationcode":"HGH","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"01","endstationsequenceno":"13","departuretime":"06:55","arrivaltime":"13:03","costtime":"06:08","day":1,"canbuy":"Y","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"14","numyd":"有","numsw":"13","sequenceno":1,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G20","trainno12306":"5600000G2011","departstation":"杭州东","terminalstation":"北京南","departstationcode":"HGH","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"01","endstationsequenceno":"05","departuretime":"07:48","arrivaltime":"12:20","costtime":"04:32","day":1,"canbuy":"N","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"无","numyd":"无","numsw":"无","sequenceno":1,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G58","trainno12306":"5e00000G5840","departstation":"宁波","terminalstation":"北京南","departstationcode":"NGH","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"04","endstationsequenceno":"14","departuretime":"08:50","arrivaltime":"14:43","costtime":"05:53","day":1,"canbuy":"N","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"无","numyd":"无","numsw":"无","sequenceno":4,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G36","trainno12306":"5600000G3660","departstation":"诸暨","terminalstation":"北京南","departstationcode":"ZDH","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"02","endstationsequenceno":"12","departuretime":"09:05","arrivaltime":"14:53","costtime":"05:48","day":1,"canbuy":"Y","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"无","numyd":"有","numsw":"6","sequenceno":2,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G42","trainno12306":"5600000G4200","departstation":"杭州东","terminalstation":"北京南","departstationcode":"HGH","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"01","endstationsequenceno":"12","departuretime":"09:24","arrivaltime":"16:08","costtime":"06:44","day":1,"canbuy":"Y","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"5","numyd":"有","numsw":"无","sequenceno":1,"type":"G","pricesw":"1966.0","pricetd":null,"pricerz":"1048.5","priceyz":"626.0","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G46","trainno12306":"5600000G4650","departstation":"江山","terminalstation":"北京南","departstationcode":"JUH","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"07","endstationsequenceno":"17","departuretime":"09:50","arrivaltime":"15:43","costtime":"05:53","day":1,"canbuy":"N","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"无","numyd":"无","numsw":"无","sequenceno":7,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G38","trainno12306":"5u00000G380J","departstation":"南昌西","terminalstation":"北京南","departstationcode":"NXG","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"08","endstationsequenceno":"21","departuretime":"11:34","arrivaltime":"18:09","costtime":"06:35","day":1,"canbuy":"N","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"无","numyd":"无","numsw":"无","sequenceno":8,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G168","trainno12306":"5j0000G16822","departstation":"温州南","terminalstation":"北京南","departstationcode":"VRH","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"09","endstationsequenceno":"24","departuretime":"11:39","arrivaltime":"18:13","costtime":"06:34","day":1,"canbuy":"N","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"无","numyd":"无","numsw":"无","sequenceno":9,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G56","trainno12306":"5800000G560J","departstation":"福州","terminalstation":"北京南","departstationcode":"FZS","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"10","endstationsequenceno":"20","departuretime":"12:47","arrivaltime":"18:53","costtime":"06:06","day":1,"canbuy":"N","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"无","numyd":"无","numsw":"无","sequenceno":10,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G32","trainno12306":"5600000G3244","departstation":"杭州东","terminalstation":"北京南","departstationcode":"HGH","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"01","endstationsequenceno":"05","departuretime":"13:00","arrivaltime":"17:39","costtime":"04:39","day":1,"canbuy":"N","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"无","numyd":"无","numsw":"无","sequenceno":1,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G164","trainno12306":"5j0000G16422","departstation":"苍南","terminalstation":"北京南","departstationcode":"CEH","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"13","endstationsequenceno":"25","departuretime":"13:41","arrivaltime":"19:53","costtime":"06:12","day":1,"canbuy":"Y","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"无","numyd":"11","numsw":"无","sequenceno":13,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G166","trainno12306":"5t0000G16610","departstation":"绍兴北","terminalstation":"北京南","departstationcode":"SLH","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"02","endstationsequenceno":"13","departuretime":"15:12","arrivaltime":"20:58","costtime":"05:46","day":1,"canbuy":"Y","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"有","numyd":"无","numsw":"1","sequenceno":2,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G60","trainno12306":"5e00000G6023","departstation":"宁波","terminalstation":"北京南","departstationcode":"NGH","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"04","endstationsequenceno":"14","departuretime":"15:43","arrivaltime":"21:29","costtime":"05:46","day":1,"canbuy":"Y","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"有","numyd":"19","numsw":"无","sequenceno":4,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G44","trainno12306":"5600000G4400","departstation":"杭州东","terminalstation":"北京南","departstationcode":"HGH","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"01","endstationsequenceno":"13","departuretime":"16:15","arrivaltime":"23:08","costtime":"06:53","day":1,"canbuy":"Y","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"有","numyd":"有","numsw":"10","sequenceno":1,"type":"G","pricesw":"1966.0","pricetd":null,"pricerz":"1048.5","priceyz":"626.0","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"Z282","trainno12306":"560000Z28230","departstation":"杭州","terminalstation":"包头","departstationcode":"HZH","terminalstationcode":"BTC","station":"杭州","endstation":"北京","stationcode":"HZH","endstationcode":"BJP","stationsequenceno":"01","endstationsequenceno":"15","departuretime":"17:04","arrivaltime":"10:22","costtime":"17:18","day":1,"canbuy":"Y","startdate":"20190626","numgr":"","numqt":"","numrw":"无","numrz":"","numtd":"","numwz":"有","numyw":"无","numyz":"无","numed":"","numyd":"","numsw":""},{"trainno":"D718","trainno12306":"560000D71800","departstation":"杭州","terminalstation":"北京","departstationcode":"HZH","terminalstationcode":"BJP","station":"杭州","endstation":"北京","stationcode":"HZH","endstationcode":"BJP","stationsequenceno":"01","endstationsequenceno":"05","departuretime":"17:32","arrivaltime":"07:07","costtime":"13:35","day":1,"canbuy":"Y","startdate":"20190626","numgr":"","numqt":"","numrw":"有","numrz":"","numtd":"","numwz":"有","numyw":"有","numyz":"","numed":"有","numyd":"","numsw":"","sequenceno":1,"type":"D","pricesw":null,"pricetd":null,"pricerz":null,"priceyz":"504.0","pricegr1":null,"pricegr2":null,"pricerw1":"957.0","pricerw2":null,"priceyw1":"756.0","priceyw2":null,"priceyw3":null},{"trainno":"G40","trainno12306":"5600000G4070","departstation":"千岛湖","terminalstation":"北京南","departstationcode":"QDU","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"05","endstationsequenceno":"07","departuretime":"19:00","arrivaltime":"23:23","costtime":"04:23","day":1,"canbuy":"Y","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"有","numyd":"2","numsw":"无","sequenceno":5,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"K102","trainno12306":"5a0000K102C0","departstation":"温州","terminalstation":"北京","departstationcode":"RZH","terminalstationcode":"BJP","station":"杭州","endstation":"北京","stationcode":"HZH","endstationcode":"BJP","stationsequenceno":"10","endstationsequenceno":"28","departuretime":"19:23","arrivaltime":"15:43","costtime":"20:20","day":1,"canbuy":"Y","startdate":"20190626","numgr":"","numqt":"","numrw":"9","numrz":"","numtd":"","numwz":"无","numyw":"无","numyz":"有","numed":"","numyd":"","numsw":"","sequenceno":10,"type":"K","pricesw":null,"pricetd":null,"pricerz":null,"priceyz":"189.5","pricegr1":null,"pricegr2":null,"pricerw1":"504.5","pricerw2":null,"priceyw1":"322.5","priceyw2":null,"priceyw3":null},{"trainno":"D712","trainno12306":"560000D71201","departstation":"杭州","terminalstation":"北京","departstationcode":"HZH","terminalstationcode":"BJP","station":"杭州","endstation":"北京","stationcode":"HZH","endstationcode":"BJP","stationsequenceno":"01","endstationsequenceno":"05","departuretime":"20:05","arrivaltime":"09:36","costtime":"13:31","day":1,"canbuy":"Y","startdate":"20190626","numgr":"","numqt":"","numrw":"有","numrz":"","numtd":"","numwz":"有","numyw":"有","numyz":"","numed":"有","numyd":"","numsw":"","sequenceno":1,"type":"D","pricesw":null,"pricetd":null,"pricerz":null,"priceyz":"504.0","pricegr1":null,"pricegr2":null,"pricerw1":"957.0","pricerw2":null,"priceyw1":"756.0","priceyw2":null,"priceyw3":null}]}
     */

    private int status;
    private String msg;
    private ResultBean result;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * start : 杭州
         * end : 北京
         * date : 2019-06-26
         * list : [{"trainno":"G34","trainno12306":"5600000G3490","departstation":"杭州东","terminalstation":"北京南","departstationcode":"HGH","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"01","endstationsequenceno":"13","departuretime":"06:55","arrivaltime":"13:03","costtime":"06:08","day":1,"canbuy":"Y","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"14","numyd":"有","numsw":"13","sequenceno":1,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G20","trainno12306":"5600000G2011","departstation":"杭州东","terminalstation":"北京南","departstationcode":"HGH","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"01","endstationsequenceno":"05","departuretime":"07:48","arrivaltime":"12:20","costtime":"04:32","day":1,"canbuy":"N","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"无","numyd":"无","numsw":"无","sequenceno":1,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G58","trainno12306":"5e00000G5840","departstation":"宁波","terminalstation":"北京南","departstationcode":"NGH","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"04","endstationsequenceno":"14","departuretime":"08:50","arrivaltime":"14:43","costtime":"05:53","day":1,"canbuy":"N","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"无","numyd":"无","numsw":"无","sequenceno":4,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G36","trainno12306":"5600000G3660","departstation":"诸暨","terminalstation":"北京南","departstationcode":"ZDH","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"02","endstationsequenceno":"12","departuretime":"09:05","arrivaltime":"14:53","costtime":"05:48","day":1,"canbuy":"Y","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"无","numyd":"有","numsw":"6","sequenceno":2,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G42","trainno12306":"5600000G4200","departstation":"杭州东","terminalstation":"北京南","departstationcode":"HGH","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"01","endstationsequenceno":"12","departuretime":"09:24","arrivaltime":"16:08","costtime":"06:44","day":1,"canbuy":"Y","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"5","numyd":"有","numsw":"无","sequenceno":1,"type":"G","pricesw":"1966.0","pricetd":null,"pricerz":"1048.5","priceyz":"626.0","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G46","trainno12306":"5600000G4650","departstation":"江山","terminalstation":"北京南","departstationcode":"JUH","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"07","endstationsequenceno":"17","departuretime":"09:50","arrivaltime":"15:43","costtime":"05:53","day":1,"canbuy":"N","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"无","numyd":"无","numsw":"无","sequenceno":7,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G38","trainno12306":"5u00000G380J","departstation":"南昌西","terminalstation":"北京南","departstationcode":"NXG","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"08","endstationsequenceno":"21","departuretime":"11:34","arrivaltime":"18:09","costtime":"06:35","day":1,"canbuy":"N","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"无","numyd":"无","numsw":"无","sequenceno":8,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G168","trainno12306":"5j0000G16822","departstation":"温州南","terminalstation":"北京南","departstationcode":"VRH","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"09","endstationsequenceno":"24","departuretime":"11:39","arrivaltime":"18:13","costtime":"06:34","day":1,"canbuy":"N","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"无","numyd":"无","numsw":"无","sequenceno":9,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G56","trainno12306":"5800000G560J","departstation":"福州","terminalstation":"北京南","departstationcode":"FZS","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"10","endstationsequenceno":"20","departuretime":"12:47","arrivaltime":"18:53","costtime":"06:06","day":1,"canbuy":"N","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"无","numyd":"无","numsw":"无","sequenceno":10,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G32","trainno12306":"5600000G3244","departstation":"杭州东","terminalstation":"北京南","departstationcode":"HGH","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"01","endstationsequenceno":"05","departuretime":"13:00","arrivaltime":"17:39","costtime":"04:39","day":1,"canbuy":"N","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"无","numyd":"无","numsw":"无","sequenceno":1,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G164","trainno12306":"5j0000G16422","departstation":"苍南","terminalstation":"北京南","departstationcode":"CEH","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"13","endstationsequenceno":"25","departuretime":"13:41","arrivaltime":"19:53","costtime":"06:12","day":1,"canbuy":"Y","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"无","numyd":"11","numsw":"无","sequenceno":13,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G166","trainno12306":"5t0000G16610","departstation":"绍兴北","terminalstation":"北京南","departstationcode":"SLH","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"02","endstationsequenceno":"13","departuretime":"15:12","arrivaltime":"20:58","costtime":"05:46","day":1,"canbuy":"Y","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"有","numyd":"无","numsw":"1","sequenceno":2,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G60","trainno12306":"5e00000G6023","departstation":"宁波","terminalstation":"北京南","departstationcode":"NGH","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"04","endstationsequenceno":"14","departuretime":"15:43","arrivaltime":"21:29","costtime":"05:46","day":1,"canbuy":"Y","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"有","numyd":"19","numsw":"无","sequenceno":4,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"G44","trainno12306":"5600000G4400","departstation":"杭州东","terminalstation":"北京南","departstationcode":"HGH","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"01","endstationsequenceno":"13","departuretime":"16:15","arrivaltime":"23:08","costtime":"06:53","day":1,"canbuy":"Y","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"有","numyd":"有","numsw":"10","sequenceno":1,"type":"G","pricesw":"1966.0","pricetd":null,"pricerz":"1048.5","priceyz":"626.0","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"Z282","trainno12306":"560000Z28230","departstation":"杭州","terminalstation":"包头","departstationcode":"HZH","terminalstationcode":"BTC","station":"杭州","endstation":"北京","stationcode":"HZH","endstationcode":"BJP","stationsequenceno":"01","endstationsequenceno":"15","departuretime":"17:04","arrivaltime":"10:22","costtime":"17:18","day":1,"canbuy":"Y","startdate":"20190626","numgr":"","numqt":"","numrw":"无","numrz":"","numtd":"","numwz":"有","numyw":"无","numyz":"无","numed":"","numyd":"","numsw":""},{"trainno":"D718","trainno12306":"560000D71800","departstation":"杭州","terminalstation":"北京","departstationcode":"HZH","terminalstationcode":"BJP","station":"杭州","endstation":"北京","stationcode":"HZH","endstationcode":"BJP","stationsequenceno":"01","endstationsequenceno":"05","departuretime":"17:32","arrivaltime":"07:07","costtime":"13:35","day":1,"canbuy":"Y","startdate":"20190626","numgr":"","numqt":"","numrw":"有","numrz":"","numtd":"","numwz":"有","numyw":"有","numyz":"","numed":"有","numyd":"","numsw":"","sequenceno":1,"type":"D","pricesw":null,"pricetd":null,"pricerz":null,"priceyz":"504.0","pricegr1":null,"pricegr2":null,"pricerw1":"957.0","pricerw2":null,"priceyw1":"756.0","priceyw2":null,"priceyw3":null},{"trainno":"G40","trainno12306":"5600000G4070","departstation":"千岛湖","terminalstation":"北京南","departstationcode":"QDU","terminalstationcode":"VNP","station":"杭州东","endstation":"北京南","stationcode":"HGH","endstationcode":"VNP","stationsequenceno":"05","endstationsequenceno":"07","departuretime":"19:00","arrivaltime":"23:23","costtime":"04:23","day":1,"canbuy":"Y","startdate":"20190626","numgr":"","numqt":"","numrw":"","numrz":"","numtd":"","numwz":"","numyw":"","numyz":"","numed":"有","numyd":"2","numsw":"无","sequenceno":5,"type":"G","pricesw":"1701.0","pricetd":null,"pricerz":"907.0","priceyz":"538.5","pricegr1":null,"pricegr2":null,"pricerw1":null,"pricerw2":null,"priceyw1":null,"priceyw2":null,"priceyw3":null},{"trainno":"K102","trainno12306":"5a0000K102C0","departstation":"温州","terminalstation":"北京","departstationcode":"RZH","terminalstationcode":"BJP","station":"杭州","endstation":"北京","stationcode":"HZH","endstationcode":"BJP","stationsequenceno":"10","endstationsequenceno":"28","departuretime":"19:23","arrivaltime":"15:43","costtime":"20:20","day":1,"canbuy":"Y","startdate":"20190626","numgr":"","numqt":"","numrw":"9","numrz":"","numtd":"","numwz":"无","numyw":"无","numyz":"有","numed":"","numyd":"","numsw":"","sequenceno":10,"type":"K","pricesw":null,"pricetd":null,"pricerz":null,"priceyz":"189.5","pricegr1":null,"pricegr2":null,"pricerw1":"504.5","pricerw2":null,"priceyw1":"322.5","priceyw2":null,"priceyw3":null},{"trainno":"D712","trainno12306":"560000D71201","departstation":"杭州","terminalstation":"北京","departstationcode":"HZH","terminalstationcode":"BJP","station":"杭州","endstation":"北京","stationcode":"HZH","endstationcode":"BJP","stationsequenceno":"01","endstationsequenceno":"05","departuretime":"20:05","arrivaltime":"09:36","costtime":"13:31","day":1,"canbuy":"Y","startdate":"20190626","numgr":"","numqt":"","numrw":"有","numrz":"","numtd":"","numwz":"有","numyw":"有","numyz":"","numed":"有","numyd":"","numsw":"","sequenceno":1,"type":"D","pricesw":null,"pricetd":null,"pricerz":null,"priceyz":"504.0","pricegr1":null,"pricegr2":null,"pricerw1":"957.0","pricerw2":null,"priceyw1":"756.0","priceyw2":null,"priceyw3":null}]
         */

        private String start;
        private String end;
        private String date;
        private List<ListBean> list;

        public String getStart() {
            return start;
        }

        public void setStart(String start) {
            this.start = start;
        }

        public String getEnd() {
            return end;
        }

        public void setEnd(String end) {
            this.end = end;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * trainno : G34
             * trainno12306 : 5600000G3490
             * departstation : 杭州东
             * terminalstation : 北京南
             * departstationcode : HGH
             * terminalstationcode : VNP
             * station : 杭州东
             * endstation : 北京南
             * stationcode : HGH
             * endstationcode : VNP
             * stationsequenceno : 01
             * endstationsequenceno : 13
             * departuretime : 06:55
             * arrivaltime : 13:03
             * costtime : 06:08
             * day : 1
             * canbuy : Y
             * startdate : 20190626
             * numgr :
             * numqt :
             * numrw :
             * numrz :
             * numtd :
             * numwz :
             * numyw :
             * numyz :
             * numed : 14
             * numyd : 有
             * numsw : 13
             * sequenceno : 1
             * type : G
             * pricesw : 1701.0
             * pricetd : null
             * pricerz : 907.0
             * priceyz : 538.5
             * pricegr1 : null
             * pricegr2 : null
             * pricerw1 : null
             * pricerw2 : null
             * priceyw1 : null
             * priceyw2 : null
             * priceyw3 : null
             */

            private String trainno;
            private String trainno12306;
            private String departstation;
            private String terminalstation;
            private String departstationcode;
            private String terminalstationcode;
            private String station;
            private String endstation;
            private String stationcode;
            private String endstationcode;
            private String stationsequenceno;
            private String endstationsequenceno;
            private String departuretime;
            private String arrivaltime;
            private String costtime;
            private int day;
            private String canbuy;
            private String startdate;
            private String numgr;
            private String numqt;
            private String numrw;
            private String numrz;
            private String numtd;
            private String numwz;
            private String numyw;
            private String numyz;
            private String numed;
            private String numyd;
            private String numsw;
            private int sequenceno;
            private String type;
            private String pricesw;
            private Object pricetd;
            private String pricerz;
            private String priceyz;
            private Object pricegr1;
            private Object pricegr2;
            private Object pricerw1;
            private Object pricerw2;
            private Object priceyw1;
            private Object priceyw2;
            private Object priceyw3;

            public String getTrainno() {
                return trainno;
            }

            public void setTrainno(String trainno) {
                this.trainno = trainno;
            }

            public String getTrainno12306() {
                return trainno12306;
            }

            public void setTrainno12306(String trainno12306) {
                this.trainno12306 = trainno12306;
            }

            public String getDepartstation() {
                return departstation;
            }

            public void setDepartstation(String departstation) {
                this.departstation = departstation;
            }

            public String getTerminalstation() {
                return terminalstation;
            }

            public void setTerminalstation(String terminalstation) {
                this.terminalstation = terminalstation;
            }

            public String getDepartstationcode() {
                return departstationcode;
            }

            public void setDepartstationcode(String departstationcode) {
                this.departstationcode = departstationcode;
            }

            public String getTerminalstationcode() {
                return terminalstationcode;
            }

            public void setTerminalstationcode(String terminalstationcode) {
                this.terminalstationcode = terminalstationcode;
            }

            public String getStation() {
                return station;
            }

            public void setStation(String station) {
                this.station = station;
            }

            public String getEndstation() {
                return endstation;
            }

            public void setEndstation(String endstation) {
                this.endstation = endstation;
            }

            public String getStationcode() {
                return stationcode;
            }

            public void setStationcode(String stationcode) {
                this.stationcode = stationcode;
            }

            public String getEndstationcode() {
                return endstationcode;
            }

            public void setEndstationcode(String endstationcode) {
                this.endstationcode = endstationcode;
            }

            public String getStationsequenceno() {
                return stationsequenceno;
            }

            public void setStationsequenceno(String stationsequenceno) {
                this.stationsequenceno = stationsequenceno;
            }

            public String getEndstationsequenceno() {
                return endstationsequenceno;
            }

            public void setEndstationsequenceno(String endstationsequenceno) {
                this.endstationsequenceno = endstationsequenceno;
            }

            public String getDeparturetime() {
                return departuretime;
            }

            public void setDeparturetime(String departuretime) {
                this.departuretime = departuretime;
            }

            public String getArrivaltime() {
                return arrivaltime;
            }

            public void setArrivaltime(String arrivaltime) {
                this.arrivaltime = arrivaltime;
            }

            public String getCosttime() {
                return costtime;
            }

            public void setCosttime(String costtime) {
                this.costtime = costtime;
            }

            public int getDay() {
                return day;
            }

            public void setDay(int day) {
                this.day = day;
            }

            public String getCanbuy() {
                return canbuy;
            }

            public void setCanbuy(String canbuy) {
                this.canbuy = canbuy;
            }

            public String getStartdate() {
                return startdate;
            }

            public void setStartdate(String startdate) {
                this.startdate = startdate;
            }

            public String getNumgr() {
                return numgr;
            }

            public void setNumgr(String numgr) {
                this.numgr = numgr;
            }

            public String getNumqt() {
                return numqt;
            }

            public void setNumqt(String numqt) {
                this.numqt = numqt;
            }

            public String getNumrw() {
                return numrw;
            }

            public void setNumrw(String numrw) {
                this.numrw = numrw;
            }

            public String getNumrz() {
                return numrz;
            }

            public void setNumrz(String numrz) {
                this.numrz = numrz;
            }

            public String getNumtd() {
                return numtd;
            }

            public void setNumtd(String numtd) {
                this.numtd = numtd;
            }

            public String getNumwz() {
                return numwz;
            }

            public void setNumwz(String numwz) {
                this.numwz = numwz;
            }

            public String getNumyw() {
                return numyw;
            }

            public void setNumyw(String numyw) {
                this.numyw = numyw;
            }

            public String getNumyz() {
                return numyz;
            }

            public void setNumyz(String numyz) {
                this.numyz = numyz;
            }

            public String getNumed() {
                return numed;
            }

            public void setNumed(String numed) {
                this.numed = numed;
            }

            public String getNumyd() {
                return numyd;
            }

            public void setNumyd(String numyd) {
                this.numyd = numyd;
            }

            public String getNumsw() {
                return numsw;
            }

            public void setNumsw(String numsw) {
                this.numsw = numsw;
            }

            public int getSequenceno() {
                return sequenceno;
            }

            public void setSequenceno(int sequenceno) {
                this.sequenceno = sequenceno;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getPricesw() {
                return pricesw;
            }

            public void setPricesw(String pricesw) {
                this.pricesw = pricesw;
            }

            public Object getPricetd() {
                return pricetd;
            }

            public void setPricetd(Object pricetd) {
                this.pricetd = pricetd;
            }

            public String getPricerz() {
                return pricerz;
            }

            public void setPricerz(String pricerz) {
                this.pricerz = pricerz;
            }

            public String getPriceyz() {
                return priceyz;
            }

            public void setPriceyz(String priceyz) {
                this.priceyz = priceyz;
            }

            public Object getPricegr1() {
                return pricegr1;
            }

            public void setPricegr1(Object pricegr1) {
                this.pricegr1 = pricegr1;
            }

            public Object getPricegr2() {
                return pricegr2;
            }

            public void setPricegr2(Object pricegr2) {
                this.pricegr2 = pricegr2;
            }

            public Object getPricerw1() {
                return pricerw1;
            }

            public void setPricerw1(Object pricerw1) {
                this.pricerw1 = pricerw1;
            }

            public Object getPricerw2() {
                return pricerw2;
            }

            public void setPricerw2(Object pricerw2) {
                this.pricerw2 = pricerw2;
            }

            public Object getPriceyw1() {
                return priceyw1;
            }

            public void setPriceyw1(Object priceyw1) {
                this.priceyw1 = priceyw1;
            }

            public Object getPriceyw2() {
                return priceyw2;
            }

            public void setPriceyw2(Object priceyw2) {
                this.priceyw2 = priceyw2;
            }

            public Object getPriceyw3() {
                return priceyw3;
            }

            public void setPriceyw3(Object priceyw3) {
                this.priceyw3 = priceyw3;
            }
        }
    }
}
