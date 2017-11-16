<template>
    <div class="page">

        <header class="el-header page-container" style="margin-bottom: 30px;">
            <el-row>
                <el-col :span="8"><div class="grid-content bg-purple-dark">LOGO</div></el-col>
                <el-col :span="16"><div class="grid-content bg-purple-dark">
                    <div class="home-btn">
                        <el-button size="small" round @click="login">登录</el-button>
                        <el-button size="small" round @click="register">注册</el-button>
                    </div>
                </div>
                </el-col>
            </el-row>

        </header>
        <main class="el-main">

            <div class="banner" style="height: 580px;">
            <el-carousel>
                <el-carousel-item>
                    <img src="http://fe-static.vipkid.com.cn/img/sem/sem-banner-new-5109bc15e2.png" width="100%" height="100%" />
                </el-carousel-item>
            </el-carousel>
            </div>
            <div class="page-container" style="margin-top: 10px;margin-bottom: 10px;">
                <h2 style="text-align: center">我们的优势</h2>
            <el-row>
                <el-col :span="7" v-for="(o, index) in 3" :key="o" :offset="index > 0 ? 1 : 0">
                    <el-card :body-style="{ padding: '0px' }">
                        <img src="http://element-cn.eleme.io/static/hamburger.50e4091.png" class="image">
                        <div style="padding: 14px;">
                            <span>好吃的汉堡</span>
                            <div class="bottom clearfix">
                                <time class="time">{{ currentDate }}</time>
                                <el-button type="text" class="button">操作按钮</el-button>
                            </div>
                        </div>
                    </el-card>
                </el-col>
            </el-row>

                <div class="lesson_c">
                    <dl style="text-align: center;margin-top: 20px;">
                        <dt><h1>课程体系</h1></dt>
                        <dd>根据一对一测评结果，选择不同级别的主修课程</dd>
                    </dl>
                    <img src="http://fe-static.vipkid.com.cn/img/sem/standard01-c6cd2604d6.png" width="100%" />
                    <img src="//fe-static.vipkid.com.cn/img/sem/classintro-table-18d752bd21.png" width="100%" />
                </div>
            </div>
            <div style="background-color: #f67024;height: 300px;color: white;text-align: center;padding: 50px 0px 50px 0px;">
                <div class="page-container chengnuo">
                <p><h1>我们的承诺</h1></p>
                    <el-row>
                        <el-col :span="8"><div class="grid-content bg-purple">对课程或服务不满意，可在开课（包括主修课和公开课）后30天内，并且上课少于12节向我们提出“无条件全额退款”申请。</div></el-col>
                        <el-col :span="8"><div class="grid-content bg-purple-light">付费后，每位学员都会与VIPKID签订
                            一份购买协议，我们向学员保障服务水平。</div></el-col>
                        <el-col :span="8"><div class="grid-content bg-purple">VIPKID一贯坚持“纯北美外教，纯美国教材
                            “的教学理念，我们保证外教的优质教学水平。</div></el-col>
                    </el-row>
                </div>
            </div>
            <!--<div>-->
                <!--<el-button @click="Login">登录</el-button>-->
                <!--<el-button type="primary">主要按钮</el-button>-->
                <!--<el-button type="success">成功按钮</el-button>-->
                <!--<el-button type="info">信息按钮</el-button>-->
                <!--<el-button type="warning">警告按钮</el-button>-->
                <!--<el-button type="danger">危险按钮</el-button>-->
            <!--</div>-->
        </main>
        <footer class="el-footer" style="
    background: #666;
    color: #fff;
    padding: 10px 0;text-align: center">
            <div class="page-container">
            <div class="footArea">
                <p class="footLink">
                    <a href="" target="_blank">关于我们</a>
                    <a href="http://www.vipkid.com.cn/contact" target="_blank">联系我们</a>
                    <a href="http://www.vipkid.com.cn/jobs" target="_blank">加入我们</a>
                    <a href="http://www.vipkid.com.cn/media" target="_blank">媒体报道</a>
                    <a href="http://www.vipkid.com.cn/cooperation" target="_blank">渠道合作</a>
                    <a href="http://www.vipkid.com.cn/download" target="_blank">常用软件</a>
                    <a href="http://www.vipkid.com.cn/faq" target="_blank">常见问题</a>
                    <a href="http://teacher-recruitment.vipkid.com.cn/" target="_blank" title="Teacher Recruitment">Teacher Recruitment</a>
                </p>
                <!--<p class="footContact">客服电话：1010-1613<br>(工作时间  周一至周日 08:30~22:00)</p>-->
            </div>
            <div class="footIcp">京ICP备 14002500号&nbsp;&nbsp;&nbsp;&nbsp;北京大米科技有限公司
                <p>公司地址：北京市东城区地安门东大街89号16幢2层201</p>
            </div>
            </div>
        </footer>
    </div>
</template>

<script>
    export default {
        name: 'Home',
        data: function() {
            return {
                num1: 1,
                currentDate: new Date()
            }
        },
        methods: {
            handleSelect(key, keyPath) {
                console.log(key, keyPath);
            },
            handleChange(){
                alert();
            },
            onSubmit(){
                alert("搜索事件！！！");
            },
            handleClose(tag) {
                this.tags.splice(this.tags.indexOf(tag), 1);
            },
            handleCurrentChange(){
                alert();
            },
            handleChange(value) {
                console.log(value);
            },
            login(){
                this.$router.push("login");
            },
            register(){
                this.$router.push("register");
            }
        }
    }
</script>

<style>
    body{margin: 0px;}
    .page-container{
        width: 1140px;margin: 0 auto;
    }
    .home-btn{float: right}
    .el-tag{margin-top: 10px;}
    .el-tag + .el-tag {
        margin-left: 15px;
    }
    .el-breadcrumb{margin-bottom: 15px;}
    .el-pagination{margin-top: 10px;}
    .el-carousel__item h3 {
        color: #475669;
        font-size: 18px;
        opacity: 0.75;
        line-height: 300px;
        margin: 0;
    }

    .el-carousel__item:nth-child(2n) {
        background-color: #99a9bf;
    }

    .el-carousel__item:nth-child(2n+1) {
        background-color: #d3dce6;
    }
    .time {
        font-size: 13px;
        color: #999;
    }

    .bottom {
        margin-top: 13px;
        line-height: 12px;
    }

    .button {
        padding: 0;
        float: right;
    }

    .image {
        width: 100%;
        display: block;
    }

    .clearfix:before,
    .clearfix:after {
        display: table;
        content: "";
    }

    .clearfix:after {
        clear: both
    }
    .el-carousel{
        width: 100%;
        height: 100%;
    }
    .el-carousel__container{
        position: absolute;
        width: 100%;
        height: 100%;
    }
    .lesson_c {
        width: 988px;
        z-index: 1;
        padding: 0 0 78px;
        margin: 0 auto;
    }
    .lesson_c img{margin-top: 50px;}
    .chengnuo .el-col{padding: 45px;}
    .footLink a {
        margin-right: 30px;
        line-height: 36px;
        color: #fff;
        filter: alpha(opacity=80);
        opacity: .8;
        list-style: none;
    }
    .footArea {
        height: 59px;
        border-bottom: 1px solid #999;
        font-size: 12px;
    }
    .footIcp {
        color: #999;
        padding: 20px 0 30px;
        font-size: 12px;
    }
</style>

