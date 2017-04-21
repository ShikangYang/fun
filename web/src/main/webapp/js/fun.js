$(function() {

  jQuery.validator.addMethod("phone", function(value, element) {
    var mobile = /^(13[0-9]|15[012356789]|18[02356789]|14[57])[0-9]{8}$/;
    return this.optional(element) || mobile.test(value);
  }, "请输入正确的手机号码。");
  
  $('#signup-form').validate({
    rules : {
      email : {
        required : true,
        email : true
      },
      username : {
        required : true,
        minlength : 2,
        maxlength : 15
      },
      phone : {
        required : true,
        phone : true
      },
      password : {
        required : true,
        minlength : 8,
        maxlength : 16
      },
      confirmPassword : {
        required : true,
        equalTo : "#password"
      },
      code : {
        required : true,
        maxlength : 4
      },
    },
    messages : {
      email : {
        required : '请输入电子邮箱。',
        email : '请输入正确的电子邮箱。'
      },
      username : {
        required : '请输入用户名。',
        minlength : $.format('用户名的必须使用2到15位字符，只能使用字母、数字和汉字。'),
        maxlength : $.format('用户名的必须使用2到15位字符，只能使用字母、数字和汉字。')
      },
      phone : {
      required : '请输入手机号码。'},
      password : {
        required : '请输入登录密码。',
        minlength : $.format('登录密码必须使用8到16位字符，必须同时包含字母和数字。'),
        maxlength : $.format('登录密码必须使用8到16位字符，必须同时包含字母和数字。')
      },
      confirmPassword : {
        required : '请重新输入一次密码。',
        equalTo : '两次输入密码不一致。'
      },
      code :'请输入验证码。'
    },
    submitHandler : function(form) {
      if (!$(form).valid()) {
        $('.error').eq(0).focus();
        return false;
      }

      $(form).ajaxSubmit({
        success : function(resp) {
          if (resp && resp.ec == 0) {
            Message.info('注册成功！', true);
            setTimeout(function() {
              window.location.href = "/";
            }, 2000);

          } else {
            Message.error('注册失败：' + resp.em, false);
          }
        },
        error : function() {
          Message.error('注册失败！', false);
        }
      });
    }
  });

  $('#login-form').validate({
    rules : {
      username : {
        required : true,
        minlength : 2,
        maxlength : 15
      },
      password : {
        required : true
      }
    },
    messages : {
      username : {
        required : '用户名和密码不能为空。',
        minlength : "请输入正确的用户名。",
        maxlength : "请输入正确的用户名。"
      },
      password : {
        required : '用户名和密码不能为空。'
      }
    },
    errorPlacement: function(error, element) { 
      $("#error").empty();
      error.appendTo("#error"); 
    },
    submitHandler : function(form) {
      if (!$(form).valid()) {
        $('.error').eq(0).focus();
        return false;
      }
      $(form).ajaxSubmit({
        success : function(resp) {
          if (resp && resp.ec == 0) {
            Message.info('登录成功！', true);
            var to = resp.rst;
            setTimeout(function() {
              window.location.href = (to == '' ? '/' : to);
            }, 2000);

          } else {
            Message.error('登录失败：' + resp.em, false);
          }
        },
        error : function() {
          Message.error('登录失败！', false);
        }
      });
    }
  });
  
  $('#userInfo-form').validate({
    rules : {
      email : {
        email : true
      },
      phone : {
        required : true,
        phone : true
      }
    },
    messages : {
      email : "请输入正确的电子邮箱。",
      phone : {required : '请输入正确的手机号。'}
    },
    submitHandler : function(form) {
      if (!$(form).valid()) {
        $('.error').eq(0).focus();
        return false;
      }

      $(form).ajaxSubmit({
        success : function(resp) {
          if (resp && resp.ec == 0) {
            Message.info('修改成功！', true);
            setTimeout(function() {
              window.location.href = "/";
            }, 2000);
          } else {
            Message.error('修改失败：' + resp.em, false);
          }
        },
        error : function() {
          Message.error('修改失败！', false);
        }
      });
    }
  });

});