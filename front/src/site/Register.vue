<template>
    <div class="page-container" style="width: 1140px;margin: 0 auto;margin-top: 200px;">
    <el-container>
        <el-header>注册</el-header>
        <el-main>


            <el-row :gutter="20">
                <el-col :span="12" :offset="6"><div class="grid-content bg-purple">
                    <el-form :model="ruleForm2" status-icon :rules="rules2" ref="ruleForm2" label-width="100px" class="demo-ruleForm">
                        <el-form-item label="手机号" prop="mobile">
                            <el-input type="password" v-model="ruleForm2.mobile" auto-complete="off"></el-input>
                        </el-form-item>
                        <el-form-item label="验证码" prop="code">
                            <el-input class="code-input" v-model="ruleForm2.code"></el-input><el-button @click="sendCode">获取验证码</el-button>
                        </el-form-item>
                        <el-form-item label="密码" prop="checkPass">
                            <el-input type="password" v-model="ruleForm2.checkPass" auto-complete="off"></el-input>
                        </el-form-item>
                        <el-form-item label="">
                            <el-checkbox label="我已阅读并同意XXX协议" size="mini" name="type" check></el-checkbox>
                        </el-form-item>
                        <el-form-item>
                            <el-button type="primary" @click="submitForm('ruleForm2')">立即注册</el-button>
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
    .code-input{margin-right: 10px;display: inline-block;width: 300px;}
</style>
<script>
    export default {
        data() {
            var validateMob = (rule, value, callback) => {
                if (value === '') {
                    callback(new Error('请输入手机号'));
                } else {
                    callback();
                }
            };
            var validatePass = (rule, value, callback) => {
                if (value === '') {
                    callback(new Error('请输入密码'));
                }else {
                    callback();
                }
            };
            var validateCode = (rule, value, callback) => {
                if (value === '') {
                    callback(new Error('请再次输入验证码'));
                }else {
                    callback();
                }
            };
            return {
                ruleForm2: {
                    mobile: '',
                    code:'',
                    checkPass: '',
                },
                rules2: {
                    checkPass: [
                        { validator: validatePass, trigger: 'blur' }
                    ],
                    mobile: [
                        { validator: validateMob, trigger: 'blur' }
                    ],
                    code: [
                        { validator: validateCode, trigger: 'blur' }
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
            },
            sendCode(){
                alert("发送手机验证码");
            }
        }
    }
</script>