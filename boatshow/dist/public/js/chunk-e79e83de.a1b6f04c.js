(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-e79e83de"],{"17ad":function(t,i,s){},"481c":function(t,i,s){"use strict";s.r(i);var a=function(){var t=this,i=t.$createElement,s=t._self._c||i;return s("div",{staticClass:"contentbox"},[s("div",{staticClass:"bg flexbox"},["form"==t.flag?s("div",{staticClass:"form"},[s("h5",{staticClass:"inline-h5"},[t._v("用户名：")]),s("h5",{staticClass:"username"},[t._v("asdiuhe")]),s("hr"),s("h5",{staticClass:"inline-h5"},[t._v("手机号码：18857458646")]),s("el-button",{staticClass:"right-button",attrs:{plain:""},on:{click:function(i){t.flag="mobile"}}},[t._v("换绑新的手机号码")]),s("hr"),s("h5",{staticClass:"inline-h5"},[t._v("电子邮箱：674268773@qq.com")]),s("el-button",{staticClass:"right-button",attrs:{plain:""},on:{click:function(i){t.flag="email"}}},[t._v("换绑新的邮箱地址")])],1):t._e(),"mobile"==t.flag?s("div",{staticClass:"change_mobile"},[s("h5",{staticClass:"inline-h5"},[t._v("原手机号：")]),s("div",{staticClass:"old_mobile"},[t._v("18857458646")]),s("hr"),s("div",[s("h5",{staticClass:"inline-h5"},[t._v("新手机号：")]),s("el-input",{staticClass:"new_mobile",attrs:{placeholder:"请输入手机号码"},model:{value:t.mobile,callback:function(i){t.mobile=i},expression:"mobile"}}),s("el-button",{ref:"timeout",staticClass:"right-button",attrs:{plain:""},on:{click:t.startTimeout}},[t._v(t._s(t.timeout))])],1),s("hr"),s("div",[s("h5",{staticClass:"inline-h5"},[t._v("验证码：")]),s("el-input",{staticClass:"iden_code",attrs:{placeholder:"请输入验证码"},model:{value:t.code,callback:function(i){t.code=i},expression:"code"}})],1),s("hr"),s("div",{staticClass:"submit"},[s("el-button",{staticClass:"submit_button",attrs:{type:"primary"},on:{click:t.submit}},[t._v("确认")]),s("el-button",{staticClass:"submit_button",attrs:{plain:""},on:{click:function(i){t.flag="form"}}},[t._v("取消")])],1)]):t._e(),"email"==t.flag?s("div",{staticClass:"change_email"},[s("h5",{staticClass:"inline-h5"},[t._v("原电子邮箱：")]),s("div",{staticClass:"old_mobile"},[t._v("674268773@qq.com")]),s("hr"),s("div",[s("h5",{staticClass:"inline-h5"},[t._v("新电子邮箱：")]),s("el-input",{staticClass:"new_mobile",attrs:{placeholder:"请输入电子邮件地址"},model:{value:t.mobile,callback:function(i){t.mobile=i},expression:"mobile"}}),s("el-button",{ref:"timeout",staticClass:"right-button",attrs:{plain:""},on:{click:t.startTimeout}},[t._v(t._s(t.timeout))])],1),s("hr"),s("div",[s("h5",{staticClass:"inline-h5"},[t._v("验证码：")]),s("el-input",{staticClass:"email_code",attrs:{placeholder:"请输入验证码"},model:{value:t.code,callback:function(i){t.code=i},expression:"code"}})],1),s("hr"),s("div",{staticClass:"submit"},[s("el-button",{staticClass:"submit_button",attrs:{type:"primary"},on:{click:t.submit}},[t._v("确认")]),s("el-button",{staticClass:"submit_button",attrs:{plain:""},on:{click:function(i){t.flag="form"}}},[t._v("取消")])],1)]):t._e()])])},e=[],n={data:function(){return{flag:"form",mobile:"",oldmobile:"18857458646",code:"",timeout:"发送验证消息",time:60,canrun:!0}},watch:{canrun:function(t,i){t||console.log(this.$refs.timeout.disabled)}},components:{},computed:{username:function(){return this.$store.state.currentUser}},mounted:function(){},methods:{startTimeout:function(){var t=this;if(this.canrun){this.canrun=!1;var i=setInterval(function(){if(t.time-=1,0==t.time)return t.time=60,t.canrun=!0,t.timeout="发送验证消息",void window.clearInterval(i);t.timeout="发送验证消息(".concat(t.time,")")},1e3)}},submit:function(){}}},l=n,o=(s("5b42"),s("2877")),c=Object(o["a"])(l,a,e,!1,null,"4e8b895c",null);i["default"]=c.exports},"5b42":function(t,i,s){"use strict";var a=s("17ad"),e=s.n(a);e.a}}]);
//# sourceMappingURL=chunk-e79e83de.a1b6f04c.js.map