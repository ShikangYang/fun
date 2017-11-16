<template>
    <div class="page-container" style="width: 1140px;margin: 0 auto;margin-top: 200px;">
    <el-container>
        <el-header>登录</el-header>
        <el-main>


            <el-row :gutter="20">
                <el-col :span="12" :offset="6"><div class="grid-content bg-purple">
                    <el-form :model="ruleForm2" status-icon :rules="rules2" ref="ruleForm2" label-width="100px" class="demo-ruleForm">
                        <el-form-item label="用户名" prop="pass">
                            <el-input type="password" v-model="ruleForm2.pass" auto-complete="off"></el-input>
                        </el-form-item>
                        <el-form-item label="密码" prop="checkPass">
                            <el-input type="password" v-model="ruleForm2.checkPass" auto-complete="off"></el-input>
                        </el-form-item>
                        <el-form-item>
                            <el-button type="primary" @click="submitForm('ruleForm2')">登 录</el-button>
                        </el-form-item>
                    </el-form>
                </div></el-col>
            </el-row>




        </el-main>
        <el-footer class="footer-links">
            <hr />
            <p>
                <a href="#" target="_blank">关于我们</a>
                <a href="#" target="_blank">联系我们</a>
                <a href="#" target="_blank">加入我们</a>
                <a href="#" target="_blank">渠道合作</a>
                <a href="#" target="_blank">常见问题</a>
            </p><br/>
            <p>© 2017 GitHub, Inc.</p>
        </el-footer>
    </el-container>
    </div>
</template>
<style>
    .footer-links a {
        border-left: none;
        border-left: 1px solid #bababa;
        padding: 0 20px;
        text-decoration: none;
        color: #333;
        float: left;
    }
    .el-row{margin-top: 10%;}

</style>
<script>
    export default {
        data() {
            var validatePass = (rule, value, callback) => {
                if (value === '') {
                    callback(new Error('请输入密码'));
                } else {
                    if (this.ruleForm2.checkPass !== '') {
                        this.$refs.ruleForm2.validateField('checkPass');
                    }
                    callback();
                }
            };
            var validatePass2 = (rule, value, callback) => {
                if (value === '') {
                    callback(new Error('请再次输入密码'));
                } else if (value !== this.ruleForm2.pass) {
                    callback(new Error('两次输入密码不一致!'));
                } else {
                    callback();
                }
            };
            return {
                ruleForm2: {
                    pass: '',
                    checkPass: '',
                },
                rules2: {
                    pass: [
                        { validator: validatePass, trigger: 'blur' }
                    ],
                    checkPass: [
                        { validator: validatePass2, trigger: 'blur' }
                    ]
                }
            };
        },
        methods: {
            submitForm(formName) {
                this.$refs[formName].validate((valid) => {
                    if (valid) {
                        alert('submit!');
                    } else {
                        console.log('error submit!!');
                        return false;
                    }
                });
            },
            resetForm(formName) {
                this.$refs[formName].resetFields();
            }
        }
    }
</script>