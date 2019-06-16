package com.example.myapplication;

import java.io.Serializable;
import java.util.List;

/**
 * Created by TTT on 2019/5/14.
 */

public class NewCourseDetailBean implements Serializable {


    /**
     * msg : success
     * code : 200
     * data : {"course":{"courseId":null,"courseCount":null,"courseStartTime":null,"courseEndTime":null,"courseCate":0,"totalNum":0,"favorableRate":0,"ascription":null,"online":null,"isAudition":null,"agreement":null,"scheduleGroup":0},"goods":{"goodId":1,"goodsName":"商品1_new","banner":"http://dlsuser-test.oss-cn-beijing.aliyuncs.com/file-91d019bbbd73492386e3cbe5d5982ec7.png","sellStartTime":1557036248000,"sellEndTime":1557036251000,"payCount":11,"limitCount":2,"limitBuyNum":2,"goodsSku":[{"id":1,"goodsId":1,"specs":"1-4,2-6","price":9.1,"stock":3},{"id":2,"goodsId":1,"specs":"1-4,2-7","price":9.2,"stock":3},{"id":3,"goodsId":1,"specs":"1-4,2-8","price":9.3,"stock":3},{"id":4,"goodsId":1,"specs":"1-5,2-6","price":8.1,"stock":2},{"id":5,"goodsId":1,"specs":"1-5,2-7","price":8.2,"stock":2},{"id":6,"goodsId":1,"specs":"1-5,2-8","price":8.3,"stock":2}],"specItems":[{"id":1,"name":"类型","items":[{"id":4,"name":"教师资格证","items":null}]},{"id":2,"name":"学段","items":[{"id":6,"name":"中学","items":null},{"id":7,"name":"小学","items":null},{"id":8,"name":"幼儿园","items":null}]}],"productStatus":2,"exist":false,"originalPrice":3,"currentPrice":3,"actualPayMoney":3,"promotionType":1,"timingStartTime":1557036267000,"timingEndTime":1557036269000,"timingPrice":3,"flashSaleRemainSecond":null,"isFrontMoney":true,"depositPaid":false,"frontMoneyMsg":null,"frontMoney":2,"finalMoney":1,"isBatchPay":true,"batchMoney":3,"batchMoneyList":null,"hasPromGift":true,"promGiftTypeNames":["模考","商品","礼品","商品"],"promGiftNum":4,"promGiftList":[{"promGiftType":"模考","promGiftName":"test","refId":null},{"promGiftType":"商品","promGiftName":"test","refId":7},{"promGiftType":"礼品","promGiftName":"rr","refId":null},{"promGiftType":"商品","promGiftName":"testet","refId":1}],"hasDeduction":false,"enablePointsDeduct":false,"deductionHoneyNum":0,"pointsDeductMoney":0,"coupon":null,"couponMoney":null,"isGroupPurchase":true,"groupPurchasePrice":500,"isAdvisory":true,"advisoryList":[{"type":null,"qqId":"33","androidKey":"44","iphoneKey":"23","pageKey":"43","wechatId":"433","wechatName":"433","wechatPhoto":"http://dlsuser-test.oss-cn-beijing.aliyuncs.com/file-6ea9bc5ae07a490b808e0d76158f16e8.png","wechatQrcode":"http://dlsuser-test.oss-cn-beijing.aliyuncs.com/file-a0cf55feda7945ab8e1b66a8a0f9813a.png","phone":34324,"thirdPartyId":4234234}],"needBuyerInfo":true,"isShip":true,"isVipPeculiar":false,"studentVipPrice":2,"iphoneId":"2222","redirectType":0}}
     * timestamp : 1557821080591
     */

    private String msg;
    private int code;
    private DataBean data;
    private long timestamp;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public static class DataBean implements Serializable {
        /**
         * course : {"courseId":null,"courseCount":null,"courseStartTime":null,"courseEndTime":null,"courseCate":0,"totalNum":0,"favorableRate":0,"ascription":null,"online":null,"isAudition":null,"agreement":null,"scheduleGroup":0}
         * goods : {"goodId":1,"goodsName":"商品1_new","banner":"http://dlsuser-test.oss-cn-beijing.aliyuncs.com/file-91d019bbbd73492386e3cbe5d5982ec7.png","sellStartTime":1557036248000,"sellEndTime":1557036251000,"payCount":11,"limitCount":2,"limitBuyNum":2,"goodsSku":[{"id":1,"goodsId":1,"specs":"1-4,2-6","price":9.1,"stock":3},{"id":2,"goodsId":1,"specs":"1-4,2-7","price":9.2,"stock":3},{"id":3,"goodsId":1,"specs":"1-4,2-8","price":9.3,"stock":3},{"id":4,"goodsId":1,"specs":"1-5,2-6","price":8.1,"stock":2},{"id":5,"goodsId":1,"specs":"1-5,2-7","price":8.2,"stock":2},{"id":6,"goodsId":1,"specs":"1-5,2-8","price":8.3,"stock":2}],"specItems":[{"id":1,"name":"类型","items":[{"id":4,"name":"教师资格证","items":null}]},{"id":2,"name":"学段","items":[{"id":6,"name":"中学","items":null},{"id":7,"name":"小学","items":null},{"id":8,"name":"幼儿园","items":null}]}],"productStatus":2,"exist":false,"originalPrice":3,"currentPrice":3,"actualPayMoney":3,"promotionType":1,"timingStartTime":1557036267000,"timingEndTime":1557036269000,"timingPrice":3,"flashSaleRemainSecond":null,"isFrontMoney":true,"depositPaid":false,"frontMoneyMsg":null,"frontMoney":2,"finalMoney":1,"isBatchPay":true,"batchMoney":3,"batchMoneyList":null,"hasPromGift":true,"promGiftTypeNames":["模考","商品","礼品","商品"],"promGiftNum":4,"promGiftList":[{"promGiftType":"模考","promGiftName":"test","refId":null},{"promGiftType":"商品","promGiftName":"test","refId":7},{"promGiftType":"礼品","promGiftName":"rr","refId":null},{"promGiftType":"商品","promGiftName":"testet","refId":1}],"hasDeduction":false,"enablePointsDeduct":false,"deductionHoneyNum":0,"pointsDeductMoney":0,"coupon":null,"couponMoney":null,"isGroupPurchase":true,"groupPurchasePrice":500,"isAdvisory":true,"advisoryList":[{"type":null,"qqId":"33","androidKey":"44","iphoneKey":"23","pageKey":"43","wechatId":"433","wechatName":"433","wechatPhoto":"http://dlsuser-test.oss-cn-beijing.aliyuncs.com/file-6ea9bc5ae07a490b808e0d76158f16e8.png","wechatQrcode":"http://dlsuser-test.oss-cn-beijing.aliyuncs.com/file-a0cf55feda7945ab8e1b66a8a0f9813a.png","phone":34324,"thirdPartyId":4234234}],"needBuyerInfo":true,"isShip":true,"isVipPeculiar":false,"studentVipPrice":2,"iphoneId":"2222","redirectType":0}
         */

        private CourseBean course;
        private GoodsBean goods;

        public CourseBean getCourse() {
            return course;
        }

        public void setCourse(CourseBean course) {
            this.course = course;
        }

        public GoodsBean getGoods() {
            return goods;
        }

        public void setGoods(GoodsBean goods) {
            this.goods = goods;
        }

        public static class CourseBean implements Serializable {
            /**
             * courseId : null
             * courseCount : null
             * courseStartTime : null
             * courseEndTime : null
             * courseCate : 0
             * totalNum : 0
             * favorableRate : 0.0
             * ascription : null
             * online : null
             * isAudition : null
             * agreement : null
             * scheduleGroup : 0
             */

            private long courseId;
            private int courseCount;
            private long courseStartTime;
            private long courseEndTime;
            private int courseCate;
            private int totalNum;
            private float favorableRate;
            private int ascription;
            private int online;
            private boolean isAudition;
            private int agreement;
            private int scheduleGroup;
            private boolean startLearning;
            private List<TeacherBean> teachers;

            public long getCourseId() {
                return courseId;
            }

            public void setCourseId(long courseId) {
                this.courseId = courseId;
            }

            public int getCourseCount() {
                return courseCount;
            }

            public void setCourseCount(int courseCount) {
                this.courseCount = courseCount;
            }

            public int getAscription() {
                return ascription;
            }

            public void setAscription(int ascription) {
                this.ascription = ascription;
            }

            public boolean isAudition() {
                return isAudition;
            }

            public void setAudition(boolean audition) {
                isAudition = audition;
            }

            public boolean isStartLearning() {
                return startLearning;
            }

            public void setStartLearning(boolean startLearning) {
                this.startLearning = startLearning;
            }

            public long getCourseStartTime() {
                return courseStartTime;
            }

            public void setCourseStartTime(long courseStartTime) {
                this.courseStartTime = courseStartTime;
            }

            public long getCourseEndTime() {
                return courseEndTime;
            }

            public void setCourseEndTime(long courseEndTime) {
                this.courseEndTime = courseEndTime;
            }

            public int getCourseCate() {
                return courseCate;
            }

            public void setCourseCate(int courseCate) {
                this.courseCate = courseCate;
            }

            public int getTotalNum() {
                return totalNum;
            }

            public void setTotalNum(int totalNum) {
                this.totalNum = totalNum;
            }

            public float getFavorableRate() {
                return favorableRate;
            }

            public void setFavorableRate(float favorableRate) {
                this.favorableRate = favorableRate;
            }

            public int getOnline() {
                return online;
            }

            public void setOnline(int online) {
                this.online = online;
            }

            public int getAgreement() {
                return agreement;
            }

            public void setAgreement(int agreement) {
                this.agreement = agreement;
            }

            public int getScheduleGroup() {
                return scheduleGroup;
            }

            public void setScheduleGroup(int scheduleGroup) {
                this.scheduleGroup = scheduleGroup;
            }

            public List<TeacherBean> getTeachers() {
                return teachers;
            }

            public void setTeachers(List<TeacherBean> teachers) {
                this.teachers = teachers;
            }

            public static class TeacherBean implements Serializable {

                private String introduce;
                private String name;
                private String thumbnail;
                private String slogan;
                private long teacherId;
                private String score;

                public String getScore() {
                    return score;
                }

                public void setScore(String score) {
                    this.score = score;
                }

                public String getIntroduce() {
                    return introduce;
                }

                public void setIntroduce(String introduce) {
                    this.introduce = introduce;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getThumbnail() {
                    return thumbnail;
                }

                public void setThumbnail(String thumbnail) {
                    this.thumbnail = thumbnail;
                }

                public String getSlogan() {
                    return slogan;
                }

                public void setSlogan(String slogan) {
                    this.slogan = slogan;
                }

                public long getTeacherId() {
                    return teacherId;
                }

                public void setTeacherId(long teacherId) {
                    this.teacherId = teacherId;
                }
            }

        }

        public static class GoodsBean implements Serializable {
            /**
             * goodId : 1
             * goodsName : 商品1_new
             * banner : http://dlsuser-test.oss-cn-beijing.aliyuncs.com/file-91d019bbbd73492386e3cbe5d5982ec7.png
             * sellStartTime : 1557036248000
             * sellEndTime : 1557036251000
             * payCount : 11
             * limitCount : 2
             * limitBuyNum : 2
             * goodsSku : [{"id":1,"goodsId":1,"specs":"1-4,2-6","price":9.1,"stock":3},{"id":2,"goodsId":1,"specs":"1-4,2-7","price":9.2,"stock":3},{"id":3,"goodsId":1,"specs":"1-4,2-8","price":9.3,"stock":3},{"id":4,"goodsId":1,"specs":"1-5,2-6","price":8.1,"stock":2},{"id":5,"goodsId":1,"specs":"1-5,2-7","price":8.2,"stock":2},{"id":6,"goodsId":1,"specs":"1-5,2-8","price":8.3,"stock":2}]
             * specItems : [{"id":1,"name":"类型","items":[{"id":4,"name":"教师资格证","items":null}]},{"id":2,"name":"学段","items":[{"id":6,"name":"中学","items":null},{"id":7,"name":"小学","items":null},{"id":8,"name":"幼儿园","items":null}]}]
             * productStatus : 2
             * exist : false
             * originalPrice : 3.0
             * currentPrice : 3.0
             * actualPayMoney : 3.0
             * promotionType : 1
             * timingStartTime : 1557036267000
             * timingEndTime : 1557036269000
             * timingPrice : 3.0
             * flashSaleRemainSecond : null
             * isFrontMoney : true
             * depositPaid : false
             * frontMoneyMsg : null
             * frontMoney : 2.0
             * finalMoney : 1.0
             * isBatchPay : true
             * batchMoney : 3.0
             * batchMoneyList : null
             * hasPromGift : true
             * promGiftTypeNames : ["模考","商品","礼品","商品"]
             * promGiftNum : 4
             * promGiftList : [{"promGiftType":"模考","promGiftName":"test","refId":null},{"promGiftType":"商品","promGiftName":"test","refId":7},{"promGiftType":"礼品","promGiftName":"rr","refId":null},{"promGiftType":"商品","promGiftName":"testet","refId":1}]
             * hasDeduction : false
             * enablePointsDeduct : false
             * deductionHoneyNum : 0
             * pointsDeductMoney : 0.0
             * coupon : null
             * couponMoney : null
             * isGroupPurchase : true
             * groupPurchasePrice : 500.0
             * isAdvisory : true
             * advisoryList : [{"type":null,"qqId":"33","androidKey":"44","iphoneKey":"23","pageKey":"43","wechatId":"433","wechatName":"433","wechatPhoto":"http://dlsuser-test.oss-cn-beijing.aliyuncs.com/file-6ea9bc5ae07a490b808e0d76158f16e8.png","wechatQrcode":"http://dlsuser-test.oss-cn-beijing.aliyuncs.com/file-a0cf55feda7945ab8e1b66a8a0f9813a.png","phone":34324,"thirdPartyId":4234234}]
             * needBuyerInfo : true
             * isShip : true
             * isVipPeculiar : false
             * studentVipPrice : 2.0
             * iphoneId : 2222
             * redirectType : 0
             */

            private long goodId;
            private String goodsName;
            private String banner;
            private long sellStartTime;
            private long sellEndTime;
            private int payCount;
            private int limitCount;
            private int limitBuyNum;
            private int productStatus;
            private boolean exist;
            private String originalPrice;
            private String currentPrice;
            private String actualPayMoney;
            private int promotionType;
            private long timingStartTime;
            private long timingEndTime;
            private String timingPrice;
            private long flashSaleRemainSecond;
            private boolean isFrontMoney;
            private boolean depositPaid;
            private String frontMoneyMsg;
            private String frontMoney;
            private String finalMoney;
            private boolean isBatchPay;
            private String batchMoney;
            private List<BatchMoneyBean> batchMoneyList;
            private boolean hasPromGift;
            private int promGiftNum;
            private boolean hasDeduction;
            private boolean enablePointsDeduct;
            private String deductionHoneyNum;
            private String pointsDeductMoney;
            private boolean coupon;
            private String couponMoney;
            private boolean isGroupPurchase;
            private String groupPurchasePrice;
            private boolean isAdvisory;
            private boolean needBuyerInfo;//需要购买者QQ true-需要 false-不需要 ,
            private boolean isShip;
            private boolean isVipPeculiar;
            private String studentVipPrice;
            private String iphoneId;
            private int redirectType;
            private List<GoodsSkuBean> goodsSku;
            private List<SpecItemsBean> specItems;
            private List<String> promGiftTypeNames;
            private List<PromGiftListBean> promGiftList;
            private AdvisoryListBean advisoryList;
            private boolean needUserContact;//是否需要用户联系信息 地址,联系方式,姓名
            private int groupPurchaseCount;
            private String groupPurchaseShareUrl;
            private int groupPurchaseStatus;
            private String groupPurchaseUrl;
            private String shareUrl;
            private int groupPurchaseNum;
            private boolean vip;

            private String jobDesc;// 选择的职位信息 ,
            private int jobId;//职位ID ,
            private int jobProtect;//职位保护 1-启用 0 否 ,
            private int jobSelected ;//职位已经选择 1-是 0 否 ,
            private boolean userIsBatchPay;//是否分批过
            private String qidianServiceUrl;//企点客服链接

            public String getQidianServiceUrl() {
                return qidianServiceUrl;
            }

            public void setQidianServiceUrl(String qidianServiceUrl) {
                this.qidianServiceUrl = qidianServiceUrl;
            }
            public boolean isUserIsBatchPay() {
                return userIsBatchPay;
            }

            public void setUserIsBatchPay(boolean userIsBatchPay) {
                this.userIsBatchPay = userIsBatchPay;
            }

            public boolean isNeedUserContact() {
                return needUserContact;
            }

            public void setNeedUserContact(boolean needUserContact) {
                this.needUserContact = needUserContact;
            }

            public String getJobDesc() {
                return jobDesc;
            }

            public void setJobDesc(String jobDesc) {
                this.jobDesc = jobDesc;
            }

            public int getJobId() {
                return jobId;
            }

            public void setJobId(int jobId) {
                this.jobId = jobId;
            }

            public int getJobProtect() {
                return jobProtect;
            }

            public void setJobProtect(int jobProtect) {
                this.jobProtect = jobProtect;
            }

            public int getJobSelected() {
                return jobSelected;
            }

            public void setJobSelected(int jobSelected) {
                this.jobSelected = jobSelected;
            }

            public int getGroupPurchaseNum() {
                return groupPurchaseNum;
            }

            public void setGroupPurchaseNum(int groupPurchaseNum) {
                this.groupPurchaseNum = groupPurchaseNum;
            }

            public boolean isVip() {
                return vip;
            }

            public void setVip(boolean vip) {
                this.vip = vip;
            }

            public String getShareUrl() {
                return shareUrl;
            }

            public void setShareUrl(String shareUrl) {
                this.shareUrl = shareUrl;
            }

            public boolean isFrontMoney() {
                return isFrontMoney;
            }

            public void setFrontMoney(boolean frontMoney) {
                isFrontMoney = frontMoney;
            }

            public boolean isBatchPay() {
                return isBatchPay;
            }

            public void setBatchPay(boolean batchPay) {
                isBatchPay = batchPay;
            }

            public boolean isCoupon() {
                return coupon;
            }

            public boolean isGroupPurchase() {
                return isGroupPurchase;
            }

            public void setGroupPurchase(boolean groupPurchase) {
                isGroupPurchase = groupPurchase;
            }

            public boolean isAdvisory() {
                return isAdvisory;
            }

            public void setAdvisory(boolean advisory) {
                isAdvisory = advisory;
            }

            public boolean isShip() {
                return isShip;
            }

            public void setShip(boolean ship) {
                isShip = ship;
            }

            public boolean isVipPeculiar() {
                return isVipPeculiar;
            }

            public void setVipPeculiar(boolean vipPeculiar) {
                isVipPeculiar = vipPeculiar;
            }

            public int getGroupPurchaseCount() {
                return groupPurchaseCount;
            }

            public void setGroupPurchaseCount(int groupPurchaseCount) {
                this.groupPurchaseCount = groupPurchaseCount;
            }

            public String getGroupPurchaseShareUrl() {
                return groupPurchaseShareUrl;
            }

            public void setGroupPurchaseShareUrl(String groupPurchaseShareUrl) {
                this.groupPurchaseShareUrl = groupPurchaseShareUrl;
            }

            public int getGroupPurchaseStatus() {
                return groupPurchaseStatus;
            }

            public void setGroupPurchaseStatus(int groupPurchaseStatus) {
                this.groupPurchaseStatus = groupPurchaseStatus;
            }

            public String getGroupPurchaseUrl() {
                return groupPurchaseUrl;
            }

            public void setGroupPurchaseUrl(String groupPurchaseUrl) {
                this.groupPurchaseUrl = groupPurchaseUrl;
            }

            public long getGoodId() {
                return goodId;
            }

            public void setGoodId(long goodId) {
                this.goodId = goodId;
            }

            public String getGoodsName() {
                return goodsName;
            }

            public void setGoodsName(String goodsName) {
                this.goodsName = goodsName;
            }

            public String getBanner() {
                return banner;
            }

            public void setBanner(String banner) {
                this.banner = banner;
            }

            public long getSellStartTime() {
                return sellStartTime;
            }

            public void setSellStartTime(long sellStartTime) {
                this.sellStartTime = sellStartTime;
            }

            public long getSellEndTime() {
                return sellEndTime;
            }

            public void setSellEndTime(long sellEndTime) {
                this.sellEndTime = sellEndTime;
            }

            public int getPayCount() {
                return payCount;
            }

            public void setPayCount(int payCount) {
                this.payCount = payCount;
            }

            public int getLimitCount() {
                return limitCount;
            }

            public void setLimitCount(int limitCount) {
                this.limitCount = limitCount;
            }

            public int getLimitBuyNum() {
                return limitBuyNum;
            }

            public void setLimitBuyNum(int limitBuyNum) {
                this.limitBuyNum = limitBuyNum;
            }

            public int getProductStatus() {
                return productStatus;
            }

            public void setProductStatus(int productStatus) {
                this.productStatus = productStatus;
            }

            public boolean isExist() {
                return exist;
            }

            public void setExist(boolean exist) {
                this.exist = exist;
            }

            public String getOriginalPrice() {
                return originalPrice;
            }

            public void setOriginalPrice(String originalPrice) {
                this.originalPrice = originalPrice;
            }

            public String getCurrentPrice() {
                return currentPrice;
            }

            public void setCurrentPrice(String currentPrice) {
                this.currentPrice = currentPrice;
            }

            public String getActualPayMoney() {
                return actualPayMoney;
            }

            public void setActualPayMoney(String actualPayMoney) {
                this.actualPayMoney = actualPayMoney;
            }

            public int getPromotionType() {
                return promotionType;
            }

            public void setPromotionType(int promotionType) {
                this.promotionType = promotionType;
            }

            public long getTimingStartTime() {
                return timingStartTime;
            }

            public void setTimingStartTime(long timingStartTime) {
                this.timingStartTime = timingStartTime;
            }

            public long getTimingEndTime() {
                return timingEndTime;
            }

            public void setTimingEndTime(long timingEndTime) {
                this.timingEndTime = timingEndTime;
            }

            public String getTimingPrice() {
                return timingPrice;
            }

            public void setTimingPrice(String timingPrice) {
                this.timingPrice = timingPrice;
            }

            public long getFlashSaleRemainSecond() {
                return flashSaleRemainSecond;
            }

            public void setFlashSaleRemainSecond(long flashSaleRemainSecond) {
                this.flashSaleRemainSecond = flashSaleRemainSecond;
            }

            public boolean isDepositPaid() {
                return depositPaid;
            }

            public void setDepositPaid(boolean depositPaid) {
                this.depositPaid = depositPaid;
            }

            public String getFrontMoneyMsg() {
                return frontMoneyMsg;
            }

            public void setFrontMoneyMsg(String frontMoneyMsg) {
                this.frontMoneyMsg = frontMoneyMsg;
            }

            public String getFrontMoney() {
                return frontMoney;
            }

            public void setFrontMoney(String frontMoney) {
                this.frontMoney = frontMoney;
            }

            public String getFinalMoney() {
                return finalMoney;
            }

            public void setFinalMoney(String finalMoney) {
                this.finalMoney = finalMoney;
            }

            public String getBatchMoney() {
                return batchMoney;
            }

            public void setBatchMoney(String batchMoney) {
                this.batchMoney = batchMoney;
            }

            public List<BatchMoneyBean> getBatchMoneyList() {
                return batchMoneyList;
            }

            public void setBatchMoneyList(List<BatchMoneyBean> batchMoneyList) {
                this.batchMoneyList = batchMoneyList;
            }

            public boolean isHasPromGift() {
                return hasPromGift;
            }

            public void setHasPromGift(boolean hasPromGift) {
                this.hasPromGift = hasPromGift;
            }

            public int getPromGiftNum() {
                return promGiftNum;
            }

            public void setPromGiftNum(int promGiftNum) {
                this.promGiftNum = promGiftNum;
            }

            public boolean isHasDeduction() {
                return hasDeduction;
            }

            public void setHasDeduction(boolean hasDeduction) {
                this.hasDeduction = hasDeduction;
            }

            public boolean isEnablePointsDeduct() {
                return enablePointsDeduct;
            }

            public void setEnablePointsDeduct(boolean enablePointsDeduct) {
                this.enablePointsDeduct = enablePointsDeduct;
            }

            public String getDeductionHoneyNum() {
                return deductionHoneyNum;
            }

            public void setDeductionHoneyNum(String deductionHoneyNum) {
                this.deductionHoneyNum = deductionHoneyNum;
            }

            public String getPointsDeductMoney() {
                return pointsDeductMoney;
            }

            public void setPointsDeductMoney(String pointsDeductMoney) {
                this.pointsDeductMoney = pointsDeductMoney;
            }

            public void setCoupon(boolean coupon) {
                this.coupon = coupon;
            }

            public String getCouponMoney() {
                return couponMoney;
            }

            public void setCouponMoney(String couponMoney) {
                this.couponMoney = couponMoney;
            }

            public String getGroupPurchasePrice() {
                return groupPurchasePrice;
            }

            public void setGroupPurchasePrice(String groupPurchasePrice) {
                this.groupPurchasePrice = groupPurchasePrice;
            }

            public boolean isNeedBuyerInfo() {
                return needBuyerInfo;
            }

            public void setNeedBuyerInfo(boolean needBuyerInfo) {
                this.needBuyerInfo = needBuyerInfo;
            }

            public String getStudentVipPrice() {
                return studentVipPrice;
            }

            public void setStudentVipPrice(String studentVipPrice) {
                this.studentVipPrice = studentVipPrice;
            }

            public String getIphoneId() {
                return iphoneId;
            }

            public void setIphoneId(String iphoneId) {
                this.iphoneId = iphoneId;
            }

            public int getRedirectType() {
                return redirectType;
            }

            public void setRedirectType(int redirectType) {
                this.redirectType = redirectType;
            }

            public List<GoodsSkuBean> getGoodsSku() {
                return goodsSku;
            }

            public void setGoodsSku(List<GoodsSkuBean> goodsSku) {
                this.goodsSku = goodsSku;
            }

            public List<SpecItemsBean> getSpecItems() {
                return specItems;
            }

            public void setSpecItems(List<SpecItemsBean> specItems) {
                this.specItems = specItems;
            }

            public List<String> getPromGiftTypeNames() {
                return promGiftTypeNames;
            }

            public void setPromGiftTypeNames(List<String> promGiftTypeNames) {
                this.promGiftTypeNames = promGiftTypeNames;
            }

            public List<PromGiftListBean> getPromGiftList() {
                return promGiftList;
            }

            public void setPromGiftList(List<PromGiftListBean> promGiftList) {
                this.promGiftList = promGiftList;
            }

            public AdvisoryListBean getAdvisoryList() {
                return advisoryList;
            }

            public void setAdvisoryList(AdvisoryListBean advisoryList) {
                this.advisoryList = advisoryList;
            }

            public static class BatchMoneyBean implements Serializable {
                private String balanceMoeny ;//剩余金额 ,
                private int installment ;//是否分期 1-分期 ,
                private String payMoeny;//付款金额 ,
                private int totalfinalMoeny ;//是否全部尾款 1-是 0-否

                public String getBalanceMoeny() {
                    return balanceMoeny;
                }

                public void setBalanceMoeny(String balanceMoeny) {
                    this.balanceMoeny = balanceMoeny;
                }

                public String getPayMoeny() {
                    return payMoeny;
                }

                public void setPayMoeny(String payMoeny) {
                    this.payMoeny = payMoeny;
                }

                public int getInstallment() {
                    return installment;
                }

                public void setInstallment(int installment) {
                    this.installment = installment;
                }

                public int getTotalfinalMoeny() {
                    return totalfinalMoeny;
                }

                public void setTotalfinalMoeny(int totalfinalMoeny) {
                    this.totalfinalMoeny = totalfinalMoeny;
                }
            }

            public static class GoodsSkuBean implements Serializable {
                /**
                 * id : 1
                 * goodsId : 1
                 * specs : 1-4,2-6
                 * price : 9.1
                 * stock : 3
                 */

                private long id;
                private long goodsId;
                private String specs;
                private String price;
                private int stock;

                public long getId() {
                    return id;
                }

                public void setId(long id) {
                    this.id = id;
                }

                public long getGoodsId() {
                    return goodsId;
                }

                public void setGoodsId(long goodsId) {
                    this.goodsId = goodsId;
                }

                public String getSpecs() {
                    return specs;
                }

                public void setSpecs(String specs) {
                    this.specs = specs;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public int getStock() {
                    return stock;
                }

                public void setStock(int stock) {
                    this.stock = stock;
                }
            }

            public static class SpecItemsBean implements Serializable {
                /**
                 * id : 1
                 * name : 类型
                 * items : [{"id":4,"name":"教师资格证","items":null}]
                 */

                private int id;
                private String name;
                private List<ItemsBean> items;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public List<ItemsBean> getItems() {
                    return items;
                }

                public void setItems(List<ItemsBean> items) {
                    this.items = items;
                }

                public static class ItemsBean implements Serializable {
                    /**
                     * id : 4
                     * name : 教师资格证
                     * items : null
                     */

                    private int id;
                    private String name;
                    private Object items;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public Object getItems() {
                        return items;
                    }

                    public void setItems(Object items) {
                        this.items = items;
                    }
                }
            }

            public static class PromGiftListBean implements Serializable {
                /**
                 * promGiftType : 模考
                 * promGiftName : test
                 * refId : null
                 */

                private String promGiftType;
                private String promGiftName;
                private long refId;

                public String getPromGiftType() {
                    return promGiftType;
                }

                public void setPromGiftType(String promGiftType) {
                    this.promGiftType = promGiftType;
                }

                public String getPromGiftName() {
                    return promGiftName;
                }

                public void setPromGiftName(String promGiftName) {
                    this.promGiftName = promGiftName;
                }

                public long getRefId() {
                    return refId;
                }

                public void setRefId(long refId) {
                    this.refId = refId;
                }
            }

            public static class AdvisoryListBean implements Serializable {
                /**
                 * type : null
                 * qqId : 33
                 * androidKey : 44
                 * iphoneKey : 23
                 * pageKey : 43
                 * wechatId : 433
                 * wechatName : 433
                 * wechatPhoto : http://dlsuser-test.oss-cn-beijing.aliyuncs.com/file-6ea9bc5ae07a490b808e0d76158f16e8.png
                 * wechatQrcode : http://dlsuser-test.oss-cn-beijing.aliyuncs.com/file-a0cf55feda7945ab8e1b66a8a0f9813a.png
                 * phone : 34324
                 * thirdPartyId : 4234234
                 */

                private int type;
                private String qqId;
                private String androidKey;
                private String iphoneKey;
                private String pageKey;
                private String wechatId;
                private String wechatName;
                private String wechatPhoto;
                private String wechatQrcode;
                private String phone;
                private String thirdPartyId;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getQqId() {
                    return qqId;
                }

                public void setQqId(String qqId) {
                    this.qqId = qqId;
                }

                public String getAndroidKey() {
                    return androidKey;
                }

                public void setAndroidKey(String androidKey) {
                    this.androidKey = androidKey;
                }

                public String getIphoneKey() {
                    return iphoneKey;
                }

                public void setIphoneKey(String iphoneKey) {
                    this.iphoneKey = iphoneKey;
                }

                public String getPageKey() {
                    return pageKey;
                }

                public void setPageKey(String pageKey) {
                    this.pageKey = pageKey;
                }

                public String getWechatId() {
                    return wechatId;
                }

                public void setWechatId(String wechatId) {
                    this.wechatId = wechatId;
                }

                public String getWechatName() {
                    return wechatName;
                }

                public void setWechatName(String wechatName) {
                    this.wechatName = wechatName;
                }

                public String getWechatPhoto() {
                    return wechatPhoto;
                }

                public void setWechatPhoto(String wechatPhoto) {
                    this.wechatPhoto = wechatPhoto;
                }

                public String getWechatQrcode() {
                    return wechatQrcode;
                }

                public void setWechatQrcode(String wechatQrcode) {
                    this.wechatQrcode = wechatQrcode;
                }

                public String getThirdPartyId() {
                    return thirdPartyId;
                }

                public void setThirdPartyId(String thirdPartyId) {
                    this.thirdPartyId = thirdPartyId;
                }

                public String getPhone() {
                    return phone;
                }

                public void setPhone(String phone) {
                    this.phone = phone;
                }
            }
        }
    }
}
