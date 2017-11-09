<template>
    <div class="page-container" id="app">

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
            <el-menu
                    :default-active="activeIndex2"
                    class="el-menu-demo"
                    mode="horizontal"
                    @select="handleSelect"
                    background-color="#545c64"
                    text-color="#fff"
                    active-text-color="#ffd04b">
                <el-menu-item index="1">处理中心</el-menu-item>
                <el-submenu index="2">
                    <template slot="title">我的工作台</template>
                    <el-menu-item index="2-1">选项1</el-menu-item>
                    <el-menu-item index="2-2">选项2</el-menu-item>
                    <el-menu-item index="2-3">选项3</el-menu-item>
                </el-submenu>
                <el-menu-item index="3"><a href="#" target="_blank">订单管理</a></el-menu-item>
            </el-menu>
        </header>
        <main class="el-main">
            <el-breadcrumb separator-class="el-icon-arrow-right">
                <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
                <el-breadcrumb-item>活动管理</el-breadcrumb-item>
                <el-breadcrumb-item>活动列表</el-breadcrumb-item>
                <el-breadcrumb-item>活动详情</el-breadcrumb-item>
            </el-breadcrumb>
            <el-collapse @change="handleChange">
                <el-collapse-item title="一致性 Consistency" name="1">
                    <div><el-tag>标签一</el-tag>
                        <el-tag type="success">标签二</el-tag>
                        <el-tag type="info">标签三</el-tag>
                        <el-tag type="warning">标签四</el-tag>
                        <el-tag type="danger">标签五
                        </el-tag></div>
                </el-collapse-item>
                <el-collapse-item title="反馈 Feedback" name="2">
                    <div>控制反馈：通过界面样式和交互动效让用户可以清晰的感知自己的操作；</div>
                    <div>页面反馈：操作后，通过页面元素的变化清晰地展现当前状态。</div>
                </el-collapse-item>
            </el-collapse>

            <el-tag
                    v-for="tag in tags"
                    :key="tag"
                    closable
                    :disable-transitions="false"
                    @close="handleClose(tag)">
                {{tag}}
            </el-tag>
            <el-table
                    ref="singleTable"
                    :data="tableData"
                    highlight-current-row
                    @current-change="handleCurrentChange"
                    style="width: 100%">
                <el-table-column
                        type="index"
                        width="50">
                </el-table-column>
                <el-table-column
                        property="date"
                        label="日期"
                        width="120">
                </el-table-column>
                <el-table-column
                        property="name"
                        label="姓名"
                        width="120">
                </el-table-column>
                <el-table-column
                        property="address"
                        label="地址">
                </el-table-column>
            </el-table>
            <div class="block">
                <el-pagination
                        @current-change="handleCurrentChange"
                        :page-size="10"
                        layout="total, prev, pager, next"
                        :total="30">
                </el-pagination>
            </div>
        </main>
        <footer class="el-footer" style="height: 60px;">Footer</footer>
    </div>

</template>

<script>
    new Vue({
        el: '#app',
        data: function() {
            return { visible: false,activeIndex2: '1',
                tags: ['标签一', '标签二', '标签三3333'],
                tableData: [{
                    date: '2016-05-02',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1518 弄'
                }, {
                    date: '2016-05-04',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1517 弄'
                }, {
                    date: '2016-05-01',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1519 弄'
                }, {
                    date: '2016-05-03',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1516 弄'
                }]
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
            }
        }
    });

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
</style>

