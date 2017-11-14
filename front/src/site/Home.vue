<template>
    <div class="page-container">

        <header class="el-header">
            <el-row>
                <el-col :span="8"><div class="grid-content bg-purple-dark">LOGO</div></el-col>
                <el-col :span="16"><div class="grid-content bg-purple-dark">
                    <el-form :inline="true" class="demo-form-inline search_input">
                        <el-form-item>
                            <el-input placeholder="搜索关键字"></el-input>
                        </el-form-item>
                        <el-form-item>
                            <el-button type="primary" icon="el-icon-search" @click="onSubmit">搜索</el-button>
                        </el-form-item>
                    </el-form>
                </div>
                </el-col>
            </el-row>
            <el-menu :default-active="activeIndex" class="el-menu-demo" mode="horizontal" @select="handleSelect">
                <el-menu-item index="1">处理中心</el-menu-item>
                <el-submenu index="2">
                    <template slot="title">我的工作台</template>
                    <el-menu-item index="2-1">选项1</el-menu-item>
                    <el-menu-item index="2-2">选项2</el-menu-item>
                    <el-menu-item index="2-3">选项3</el-menu-item>
                </el-submenu>
                <el-menu-item index="3"><a href="#" target="_blank">订单管理</a></el-menu-item>
            </el-menu>
            <div class="line"></div>
        </header>
        <main class="el-main">

            <el-carousel indicator-position="outside">
                <el-carousel-item v-for="item in 4" :key="item">
                    <h3>{{ item }}</h3>
                </el-carousel-item>
            </el-carousel>
            <el-row>
                <el-col :span="6" v-for="(o, index) in 3" :key="o" :offset="index > 0 ? 3 : 0">
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
            <!--<div>-->
                <!--<el-button @click="Login">登录</el-button>-->
                <!--<el-button type="primary">主要按钮</el-button>-->
                <!--<el-button type="success">成功按钮</el-button>-->
                <!--<el-button type="info">信息按钮</el-button>-->
                <!--<el-button type="warning">警告按钮</el-button>-->
                <!--<el-button type="danger">危险按钮</el-button>-->
            <!--</div>-->
        </main>
        <footer class="el-footer" style="height: 60px;">Footer</footer>
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
            Login(){
                Login;
            }
        }
    }
</script>

<style>
    .page-container{
        width: 1140px;margin: 0 auto;
    }
    .search_input{float: right}
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
</style>

