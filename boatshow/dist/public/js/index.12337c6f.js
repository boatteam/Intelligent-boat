(function(t){function e(e){for(var n,o,r=e[0],c=e[1],l=e[2],m=0,u=[];m<r.length;m++)o=r[m],s[o]&&u.push(s[o][0]),s[o]=0;for(n in c)Object.prototype.hasOwnProperty.call(c,n)&&(t[n]=c[n]);d&&d(e);while(u.length)u.shift()();return i.push.apply(i,l||[]),a()}function a(){for(var t,e=0;e<i.length;e++){for(var a=i[e],n=!0,r=1;r<a.length;r++){var c=a[r];0!==s[c]&&(n=!1)}n&&(i.splice(e--,1),t=o(o.s=a[0]))}return t}var n={},s={index:0},i=[];function o(e){if(n[e])return n[e].exports;var a=n[e]={i:e,l:!1,exports:{}};return t[e].call(a.exports,a,a.exports,o),a.l=!0,a.exports}o.m=t,o.c=n,o.d=function(t,e,a){o.o(t,e)||Object.defineProperty(t,e,{enumerable:!0,get:a})},o.r=function(t){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(t,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(t,"__esModule",{value:!0})},o.t=function(t,e){if(1&e&&(t=o(t)),8&e)return t;if(4&e&&"object"===typeof t&&t&&t.__esModule)return t;var a=Object.create(null);if(o.r(a),Object.defineProperty(a,"default",{enumerable:!0,value:t}),2&e&&"string"!=typeof t)for(var n in t)o.d(a,n,function(e){return t[e]}.bind(null,n));return a},o.n=function(t){var e=t&&t.__esModule?function(){return t["default"]}:function(){return t};return o.d(e,"a",e),e},o.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},o.p="";var r=window["webpackJsonp"]=window["webpackJsonp"]||[],c=r.push.bind(r);r.push=e,r=r.slice();for(var l=0;l<r.length;l++)e(r[l]);var d=c;i.push([0,"chunk-vendors"]),a()})({0:function(t,e,a){t.exports=a("56d7")},"05d3":function(t,e,a){var n,s=a("f46e");"string"===typeof s&&(s=[[t.i,s,""]]);var i={hmr:!0};i.transform=n,i.insertInto=void 0;a("6844")(s,i);s.locals&&(t.exports=s.locals)},"24c1":function(t,e,a){var n,s=a("a905");"string"===typeof s&&(s=[[t.i,s,""]]);var i={hmr:!0};i.transform=n,i.insertInto=void 0;a("6844")(s,i);s.locals&&(t.exports=s.locals)},"25d8":function(t,e,a){"use strict";var n=a("24c1"),s=a.n(n);s.a},"47ac":function(t,e,a){var n,s=a("bd92");"string"===typeof s&&(s=[[t.i,s,""]]);var i={hmr:!0};i.transform=n,i.insertInto=void 0;a("6844")(s,i);s.locals&&(t.exports=s.locals)},"56d7":function(t,e,a){"use strict";a.r(e);a("cadf"),a("551c"),a("f751"),a("097d"),a("f9e3"),a("47ac"),a("7f10"),a("1157");var n=a("2b0e"),s=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",[a("index")],1)},i=[],o=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",[t._m(0),a("div",{staticClass:"wrapper row"},[t._m(1),a("div",{directives:[{name:"show",rawName:"v-show",value:t.allflag,expression:"allflag"}],staticClass:"col-md-8 profilebox"},[t._m(2),t._m(3)]),a("div",{directives:[{name:"show",rawName:"v-show",value:t.allflag,expression:"allflag"}],staticClass:"container col-md-4"},[a("div",{staticClass:"loginbox"},[a("h1",{staticClass:"animated bounceIn"},[t._v("Welcome")]),a("form",{staticClass:"myform animated fadeIn"},[a("input",{staticClass:"username",staticStyle:{margin:"20px auto"},attrs:{type:"text",placeholder:"用户名"}}),a("input",{staticClass:"password",attrs:{type:"password",placeholder:"密码"}}),a("div",{staticStyle:{width:"250px",margin:"0 auto"}},[a("a",{staticClass:"forgetpswshow",on:{click:function(e){e.preventDefault(),t.forgetshow=!t.forgetshow}}},[t._v("忘记密码")])]),a("br"),a("button",{attrs:{type:"submit",id:"login-button"},on:{click:function(e){return e.preventDefault(),t.login(e)}}},[t._v("Login")]),a("div",{staticStyle:{width:"250px",margin:"20px auto"}},[a("a",{staticClass:"registshow",on:{click:function(e){e.preventDefault(),t.registshow=!t.registshow}}},[t._v("立即注册")])])])])])]),a("transition",{attrs:{"enter-active-class":"animated bounceIn","leave-active-class":"animated bounceOut"}},[t.forgetshow?a("div",{staticClass:"forgetpsw"},[a("div",{staticClass:"modern-forms"},[a("div",{staticClass:"modern-container mc2"},[a("form",[a("fieldset",[a("div",{staticClass:"field-group prepend-icon"},[a("input",{staticClass:"mdn-input",attrs:{type:"text",placeholder:"请输入您的用户名"}}),a("label",{staticClass:"mdn-label"},[t._v("请输入您的用户名")]),a("span",{staticClass:"mdn-icon"},[a("i",{staticClass:"fa fa-user"})]),a("span",{staticClass:"mdn-bar"})])]),a("fieldset",[a("div",{staticClass:"form-row"},[a("div",{staticClass:"col col-7"},[a("div",{staticClass:"field-group mdn-select"},[a("select",{attrs:{name:"find_methods"}},[a("option",{attrs:{value:"find_mobile"}},[t._v("通过绑定的手机号")]),a("option",{attrs:{value:"find_email"}},[t._v("通过绑定的电子邮箱")])]),a("label",{staticClass:"mdn-label"},[t._v("请选择找回方式")]),a("span",{staticClass:"mdn-bar"})])]),a("div",{staticClass:"col col-5"},[a("div",{staticClass:"field-group"},[a("button",{staticClass:"mdn-button btn-primary"},[t._v("免费发送验证信息")])])])])]),a("div",{staticClass:"field-group prepend-icon"},[a("input",{staticClass:"mdn-input",attrs:{type:"text",placeholder:"请输入验证码"}}),a("label",{staticClass:"mdn-label"},[t._v("请输入验证码")]),a("span",{staticClass:"mdn-icon"},[a("i",{staticClass:"fa fa-lock"})]),a("span",{staticClass:"mdn-bar"})]),a("div",{staticClass:"mdn-footer"},[a("button",{staticClass:"mdn-button btn-primary",attrs:{type:"submit"}},[t._v("确认")]),a("button",{staticClass:"mdn-button btn-flat",staticStyle:{margin:"0 20px"},attrs:{type:"reset"},on:{click:function(e){t.forgetshow=!t.forgetshow}}},[t._v("取消")])])])])])]):t._e()]),a("transition",{attrs:{"enter-active-class":"animated bounceIn","leave-active-class":"animated bounceOut"}},[t.registshow?a("div",{staticClass:"regist"},[a("div",{staticClass:"modern-forms"},[a("div",{staticClass:"modern-container mc2"},[a("form",[a("fieldset",[a("div",{staticClass:"field-group prepend-icon"},[a("input",{staticClass:"mdn-input",attrs:{type:"text",placeholder:"请输入您的用户名"}}),a("label",{staticClass:"mdn-label"},[t._v("请输入您的用户名(4-16位字母或数字，首位为字母)")]),a("span",{staticClass:"mdn-icon"},[a("i",{staticClass:"fa fa-user"})]),a("span",{staticClass:"mdn-bar"})]),a("div",{staticClass:"field-group prepend-icon"},[a("input",{staticClass:"mdn-input",attrs:{type:"text",placeholder:"请输入您的密码"}}),a("label",{staticClass:"mdn-label"},[t._v("请输入您的密码(6-20位字母或数字)")]),a("span",{staticClass:"mdn-icon"},[a("i",{staticClass:"fa fa-lock"})]),a("span",{staticClass:"mdn-bar"})]),a("div",{staticClass:"field-group prepend-icon"},[a("input",{staticClass:"mdn-input",attrs:{type:"text",placeholder:"请重复您的密码"}}),a("label",{staticClass:"mdn-label"},[t._v("请重复您的密码")]),a("span",{staticClass:"mdn-icon"},[a("i",{staticClass:"fa fa-lock"})]),a("span",{staticClass:"mdn-bar"})])]),a("fieldset",[a("div",{staticClass:"form-row"},[a("div",{staticClass:"col col-7"},[a("div",{staticClass:"field-group"},[a("input",{staticClass:"mdn-input",attrs:{type:"text",placeholder:"手机号码"}}),a("label",{staticClass:"mdn-label"},[t._v("手机验证(11位数字)")]),a("span",{staticClass:"mdn-bar"})])]),a("div",{staticClass:"col col-5"},[a("div",{staticClass:"field-group"},[a("button",{staticClass:"mdn-button btn-primary"},[t._v("免费发送验证信息")])])])])]),a("div",{staticClass:"field-group prepend-icon"},[a("input",{staticClass:"mdn-input",attrs:{type:"text",placeholder:"请输入验证码"}}),a("label",{staticClass:"mdn-label"},[t._v("请输入验证码")]),a("span",{staticClass:"mdn-icon"},[a("i",{staticClass:"fa fa-lock"})]),a("span",{staticClass:"mdn-bar"})]),a("div",{staticClass:"mdn-footer"},[a("button",{staticClass:"mdn-button btn-primary",attrs:{type:"submit"}},[t._v("确认")]),a("button",{staticClass:"mdn-button btn-flat",staticStyle:{margin:"0 20px"},attrs:{type:"reset"},on:{click:function(e){t.registshow=!t.registshow}}},[t._v("取消")])])])])])]):t._e()]),a("div",{directives:[{name:"show",rawName:"v-show",value:t.leaveshow,expression:"leaveshow"}],staticClass:"leave"},[a("leave",{attrs:{leaveshow:t.leaveshow}})],1)],1)},r=[function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"banner"},[n("nav",{staticClass:"navbar navbar-default"},[n("div",{staticClass:"container-fluid"},[n("div",{staticClass:"navbar-header"},[n("a",{staticClass:"navbar-brand",attrs:{href:"/"}},[n("img",{staticClass:"bannericon",attrs:{alt:"Brand",src:a("835e")}}),n("span",{staticClass:"bannerspan"},[t._v("Explorer 无人水质监测")])])])])])])},function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("ul",{staticClass:"bg-bubbles"},[a("li"),a("li"),a("li"),a("li"),a("li"),a("li"),a("li"),a("li"),a("li"),a("li")])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"row"},[n("div",{staticClass:"profile col-md-5 text-center",attrs:{id:"pro1"}},[n("img",{staticClass:"img-circle",attrs:{src:a("835e")}}),n("h5",{staticStyle:{margin:"20px"}},[t._v("水质检测")]),n("span",[t._v("水质监测，是监视和测定水体中污染物的种类、各类污染物的浓度及变化趋势，评价水质状况的过程。")])]),n("div",{staticClass:"profile col-md-5 text-center",attrs:{id:"pro2"}},[n("img",{staticClass:"img-circle",attrs:{src:a("835e")}}),n("h5",{staticStyle:{margin:"20px"}},[t._v("水质检测")]),n("article",[t._v("水质监测，是监视和测定水体中污染物的种类、各类污染物的浓度及变化趋势，评价水质状况的过程。")])])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"row"},[n("div",{staticClass:"profile col-md-5 text-center",attrs:{id:"pro3"}},[n("img",{staticClass:"img-circle",attrs:{src:a("835e")}}),n("h5",{staticStyle:{margin:"20px"}},[t._v("水质检测")]),n("article",[t._v("水质监测，是监视和测定水体中污染物的种类、各类污染物的浓度及变化趋势，评价水质状况的过程。")])]),n("div",{staticClass:"profile col-md-5 text-center",attrs:{id:"pro4"}},[n("img",{staticClass:"img-circle",attrs:{src:a("835e")}}),n("h5",{staticStyle:{margin:"20px"}},[t._v("水质检测")]),n("article",[t._v("水质监测，是监视和测定水体中污染物的种类、各类污染物的浓度及变化趋势，评价水质状况的过程。")])])])}];function c(){var t=document.getElementById("pro1");t.addEventListener("webkitAnimationEnd",function(){t.style.opacity="1"});var e=document.getElementById("pro2");e.addEventListener("webkitAnimationEnd",function(){e.style.opacity="1"});var a=document.getElementById("pro3");a.addEventListener("webkitAnimationEnd",function(){a.style.opacity="1"});var n=document.getElementById("pro4");n.addEventListener("webkitAnimationEnd",function(){n.style.opacity="1"});t=document.getElementById("pro1");t.addEventListener("animationend",function(){t.style.opacity="1"});e=document.getElementById("pro2");e.addEventListener("animationend",function(){e.style.opacity="1"});a=document.getElementById("pro3");a.addEventListener("animationend",function(){a.style.opacity="1"});n=document.getElementById("pro4");n.addEventListener("animationend",function(){n.style.opacity="1"});t=document.getElementById("pro1");t.addEventListener("mozAnimationEnd",function(){t.style.opacity="1"});e=document.getElementById("pro2");e.addEventListener("mozAnimationEnd",function(){e.style.opacity="1"});a=document.getElementById("pro3");a.addEventListener("mozAnimationEnd",function(){a.style.opacity="1"});n=document.getElementById("pro4");n.addEventListener("mozAnimationEnd",function(){n.style.opacity="1"});t=document.getElementById("pro1");t.addEventListener("oAnimationEnd",function(){t.style.opacity="1"});e=document.getElementById("pro2");e.addEventListener("oAnimationEnd",function(){e.style.opacity="1"});a=document.getElementById("pro3");a.addEventListener("oAnimationEnd",function(){a.style.opacity="1"});n=document.getElementById("pro4");n.addEventListener("oAnimationEnd",function(){n.style.opacity="1"})}var l=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",[a("canvas",{staticClass:"canvas",staticStyle:{position:"absolute",top:"-120px"}}),a("div",{directives:[{name:"show",rawName:"v-show",value:t.flag,expression:"flag"}],staticClass:"help"},[t._v("?")]),a("div",{directives:[{name:"show",rawName:"v-show",value:t.flag,expression:"flag"}],staticClass:"ui"},[a("input",{staticClass:"ui-input",attrs:{type:"text"}}),a("span",{staticClass:"ui-return"},[t._v("↵")])]),t._m(0)])},d=[function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"overlay"},[a("div",{staticClass:"tabs"},[a("div",{staticClass:"tabs-labels"},[a("span",{staticClass:"tabs-label"},[t._v("Commands")]),a("span",{staticClass:"tabs-label"},[t._v("Info")]),a("span",{staticClass:"tabs-label"},[t._v("Share")])]),a("div",{staticClass:"tabs-panels"},[a("ul",{staticClass:"tabs-panel commands"},[a("li",{staticClass:"commands-item"},[a("span",{staticClass:"commands-item-title"},[t._v("Text")]),a("span",{staticClass:"commands-item-info",attrs:{"data-demo":"Hello :)"}},[t._v("Type anything")]),a("span",{staticClass:"commands-item-action"},[t._v("Demo")])]),a("li",{staticClass:"commands-item"},[a("span",{staticClass:"commands-item-title"},[t._v("Countdown")]),a("span",{staticClass:"commands-item-info",attrs:{"data-demo":"#countdown 10"}},[t._v("\n              #countdown\n              "),a("span",{staticClass:"commands-item-mode"},[t._v("number")])]),a("span",{staticClass:"commands-item-action"},[t._v("Demo")])]),a("li",{staticClass:"commands-item"},[a("span",{staticClass:"commands-item-title"},[t._v("Time")]),a("span",{staticClass:"commands-item-info",attrs:{"data-demo":"#time"}},[t._v("#time")]),a("span",{staticClass:"commands-item-action"},[t._v("Demo")])]),a("li",{staticClass:"commands-item"},[a("span",{staticClass:"commands-item-title"},[t._v("Rectangle")]),a("span",{staticClass:"commands-item-info",attrs:{"data-demo":"#rectangle 30x15"}},[t._v("\n              #rectangle\n              "),a("span",{staticClass:"commands-item-mode"},[t._v("width x height")])]),a("span",{staticClass:"commands-item-action"},[t._v("Demo")])]),a("li",{staticClass:"commands-item"},[a("span",{staticClass:"commands-item-title"},[t._v("Circle")]),a("span",{staticClass:"commands-item-info",attrs:{"data-demo":"#circle 25"}},[t._v("\n              #circle\n              "),a("span",{staticClass:"commands-item-mode"},[t._v("diameter")])]),a("span",{staticClass:"commands-item-action"},[t._v("Demo")])]),a("li",{staticClass:"commands-item commands-item--gap"},[a("span",{staticClass:"commands-item-title"},[t._v("Animate")]),a("span",{staticClass:"commands-item-info",attrs:{"data-demo":"The time is|#time|#countdown 3|#icon thumbs-up"}},[a("span",{staticClass:"commands-item-mode"},[t._v("command1")]),t._v(" |\n              "),a("span",{staticClass:"commands-item-mode"},[t._v("command2")])]),a("span",{staticClass:"commands-item-action"},[t._v("Demo")])])]),a("div",{staticClass:"tabs-panel ui-share"},[a("div",{staticClass:"ui-share-content"},[a("h1",[t._v("Sharing")]),a("p",[t._v("\n              Simply add\n              "),a("em",[t._v("?a=")]),t._v(" to the current URL to share any static or animated text. Examples:\n            ")]),a("p",[a("a",{attrs:{href:"http://www.kennethcachia.com/shape-shifter?a=Hello",target:"_blank"}},[t._v("www.kennethcachia.com/shape-shifter?a=Hello")]),a("br"),a("a",{attrs:{href:"http://www.kennethcachia.com/shape-shifter?a=Hello|#countdown 3",target:"_blank"}},[t._v("www.kennethcachia.com/shape-shifter?a=Hello|#countdown 3")])])])])])])])}],m=a("7618");a("28a5"),a("6c7b");function u(){var t={init:function(){var e=window.location.href,a=e.indexOf("?a=");t.Drawing.init(".canvas"),document.body.classList.add("body--ready"),-1!==a?t.UI.simulate(decodeURI(e).substring(a+3)):t.UI.simulate("Welcome||"),t.Drawing.loop(function(){t.Shape.render()})}};t.Drawing=function(){var e,a,n,s=window.requestAnimationFrame||window.webkitRequestAnimationFrame||window.mozRequestAnimationFrame||window.oRequestAnimationFrame||window.msRequestAnimationFrame||function(t){window.setTimeout(t,1e3/60)};return{init:function(n){e=document.querySelector(n),a=e.getContext("2d"),this.adjustCanvas(),window.addEventListener("resize",function(e){t.Drawing.adjustCanvas()})},loop:function(t){n=n||t,this.clearFrame(),n(),s.call(window,this.loop.bind(this))},adjustCanvas:function(){e.width=window.innerWidth,e.height=window.innerHeight},clearFrame:function(){a.clearRect(0,0,e.width,e.height)},getArea:function(){return{w:e.width,h:e.height}},drawCircle:function(t,e){a.fillStyle=e.render(),a.beginPath(),a.arc(t.x,t.y,t.z,0,2*Math.PI,!0),a.closePath(),a.fill()}}}(),t.UI=function(){var e,a,n,s=document.querySelector(".ui-input"),i=document.querySelector(".ui"),o=(document.querySelector(".help"),document.querySelector(".commands"),document.querySelector(".overlay")),r=(document.querySelector(".canvas"),!1),c=30,l=!0,d=[],u="#";function h(t){var e=t.getHours(),a=t.getMinutes();a=a<10?"0"+a:a;return e+":"+a}function p(t){return t&&t.split(" ")[1]}function v(t){return t=t&&t.split(" ")[0],t&&t[0]===u&&t.substring(1)}function f(t,n,s,i){clearInterval(e),a=i?s:1,t(a),(!s||!i&&a<s||i&&a>0)&&(e=setInterval(function(){a=i?a-1:a+1,t(a),(!i&&s&&a===s||i&&0===a)&&clearInterval(e)},n))}function w(a){clearInterval(e),d=[],n=null,a&&t.Shape.switchShape(t.ShapeBuilder.letter(""))}function g(e){var a,i;o.classList.remove("overlay--visible"),d="object"===Object(m["a"])(e)?e:d.concat(e.split("|")),s.value="",C(),f(function(s){switch(i=d.shift(),a=v(i),e=p(i),a){case"countdown":e=parseInt(e)||10,e=e>0?e:10,f(function(e){0===e?0===d.length?t.Shape.switchShape(t.ShapeBuilder.letter("")):g(d):t.Shape.switchShape(t.ShapeBuilder.letter(e),!0)},1e3,e,!0);break;case"rectangle":e=e&&e.split("x"),e=e&&2===e.length?e:[c,c/2],t.Shape.switchShape(t.ShapeBuilder.rectangle(Math.min(c,parseInt(e[0])),Math.min(c,parseInt(e[1]))));break;case"circle":e=parseInt(e)||c,e=Math.min(e,c),t.Shape.switchShape(t.ShapeBuilder.circle(e));break;case"time":var o=h(new Date);d.length>0?t.Shape.switchShape(t.ShapeBuilder.letter(o)):f(function(){o=h(new Date),o!==n&&(n=o,t.Shape.switchShape(t.ShapeBuilder.letter(n)))},1e3);break;default:t.Shape.switchShape(t.ShapeBuilder.letter(i[0]===u?"What?":i))}},2e3,d.length)}function C(t){s.value.length>18?i.classList.add("ui--wide"):i.classList.remove("ui--wide"),l&&s.value.length>0?i.classList.add("ui--enter"):i.classList.remove("ui--enter")}function y(){document.body.addEventListener("keydown",function(t){13===t.keyCode&&(l=!1,w(),g(s.value))})}function b(){y(),r&&document.body.classList.add("touch")}return b(),{simulate:function(t){g(t)}}}(),t.Point=function(t){this.x=t.x,this.y=t.y,this.z=t.z,this.a=t.a,this.h=t.h},t.Color=function(t,e,a,n){this.r=t,this.g=e,this.b=a,this.a=n},t.Color.prototype={render:function(){return"rgba("+this.r+","+ +this.g+","+this.b+","+this.a+")"}},t.Dot=function(e,a){this.p=new t.Point({x:e,y:a,z:5,a:1,h:0}),this.e=.07,this.s=!0,this.c=new t.Color(255,255,255,this.p.a),this.t=this.clone(),this.q=[]},t.Dot.prototype={clone:function(){return new t.Point({x:this.x,y:this.y,z:this.z,a:this.a,h:this.h})},_draw:function(){this.c.a=this.p.a,t.Drawing.drawCircle(this.p,this.c)},_moveTowards:function(t){var e=this.distanceTo(t,!0),a=e[0],n=e[1],s=e[2],i=this.e*s;if(-1===this.p.h)return this.p.x=t.x,this.p.y=t.y,!0;if(s>1)this.p.x-=a/s*i,this.p.y-=n/s*i;else{if(!(this.p.h>0))return!0;this.p.h--}return!1},_update:function(){if(this._moveTowards(this.t)){var e=this.q.shift();e?(this.t.x=e.x||this.p.x,this.t.y=e.y||this.p.y,this.t.z=e.z||this.p.z,this.t.a=e.a||this.p.a,this.p.h=e.h||0):this.s?(this.p.x-=Math.sin(3.142*Math.random()),this.p.y-=Math.sin(3.142*Math.random())):this.move(new t.Point({x:this.p.x+50*Math.random()-25,y:this.p.y+50*Math.random()-25}))}var a=this.p.a-this.t.a;this.p.a=Math.max(.1,this.p.a-.05*a);a=this.p.z-this.t.z;this.p.z=Math.max(1,this.p.z-.05*a)},distanceTo:function(t,e){var a=this.p.x-t.x,n=this.p.y-t.y,s=Math.sqrt(a*a+n*n);return e?[a,n,s]:s},move:function(t,e){(!e||e&&this.distanceTo(t)>1)&&this.q.push(t)},render:function(){this._update(),this._draw()}},t.ShapeBuilder=function(){var e=13,a=document.createElement("canvas"),n=a.getContext("2d"),s=500,i="Avenir, Helvetica Neue, Helvetica, Arial, sans-serif";function o(){a.width=Math.floor(window.innerWidth/e)*e,a.height=Math.floor(window.innerHeight/e)*e,n.fillStyle="red",n.textBaseline="middle",n.textAlign="center"}function r(){for(var s=n.getImageData(0,0,a.width,a.height).data,i=[],o=0,r=0,c=a.width,l=a.height,d=0,m=0,u=0;u<s.length;u+=4*e)s[u+3]>0&&(i.push(new t.Point({x:o,y:r})),d=o>d?o:d,m=r>m?r:m,c=o<c?o:c,l=r<l?r:l),o+=e,o>=a.width&&(o=0,r+=e,u+=4*e*a.width);return{dots:i,w:d+c,h:m+l}}function c(t){n.font="bold "+t+"px "+i}function l(t){return!isNaN(parseFloat(t))&&isFinite(t)}function d(){o(),window.addEventListener("resize",o)}return d(),{imageFile:function(e,s){var i=new Image,o=t.Drawing.getArea();i.onload=function(){n.clearRect(0,0,a.width,a.height),n.drawImage(this,0,0,.6*o.h,.6*o.h),s(r())},i.onerror=function(){s(t.ShapeBuilder.letter("What?"))},i.src=e},circle:function(t){var s=Math.max(0,t)/2;return n.clearRect(0,0,a.width,a.height),n.beginPath(),n.arc(s*e,s*e,s*e,0,2*Math.PI,!1),n.fill(),n.closePath(),r()},letter:function(t){var e=0;return c(s),e=Math.min(s,a.width/n.measureText(t).width*.8*s,a.height/s*(l(t)?1:.45)*s),c(e),n.clearRect(0,0,a.width,a.height),n.fillText(t,a.width/2,a.height/2),r()},rectangle:function(a,n){for(var s=[],i=e*a,o=e*n,r=0;r<o;r+=e)for(var c=0;c<i;c+=e)s.push(new t.Point({x:c,y:r}));return{dots:s,w:i,h:o}}}}(),t.Shape=function(){var e=[],a=0,n=0,s=0,i=0;function o(){var e=t.Drawing.getArea();s=e.w/2-a/2,i=e.h/2-n/2}return{shuffleIdle:function(){for(var a=t.Drawing.getArea(),n=0;n<e.length;n++)e[n].s||e[n].move({x:Math.random()*a.w,y:Math.random()*a.h})},switchShape:function(r,c){var l,d=t.Drawing.getArea();if(a=r.w,n=r.h,o(),r.dots.length>e.length){l=r.dots.length-e.length;for(var m=1;m<=l;m++)e.push(new t.Dot(d.w/2,d.h/2))}m=0;var u=0;while(r.dots.length>0)u=Math.floor(Math.random()*r.dots.length),e[m].e=c?.25:e[m].s?.14:.11,e[m].s?e[m].move(new t.Point({z:20*Math.random()+10,a:Math.random(),h:18})):e[m].move(new t.Point({z:5*Math.random()+5,h:c?18:30})),e[m].s=!0,e[m].move(new t.Point({x:r.dots[u].x+s,y:r.dots[u].y+i,a:1,z:5,h:0})),r.dots=r.dots.slice(0,u).concat(r.dots.slice(u+1)),m++;for(u=m;u<e.length;u++)e[u].s&&(e[u].move(new t.Point({z:20*Math.random()+10,a:Math.random(),h:20})),e[u].s=!1,e[u].e=.04,e[u].move(new t.Point({x:Math.random()*d.w,y:Math.random()*d.h,a:.3,z:4*Math.random(),h:0})))},render:function(){for(var t=0;t<e.length;t++)e[t].render()}}}(),t.init()}var h,p={data:function(){return{flag:!1}},props:["leaveshow"],methods:{},watch:{leaveshow:function(t,e){u(),console.log(t)}}},v=p,f=(a("25d8"),a("2877")),w=Object(f["a"])(v,l,d,!1,null,"fa567782",null),g=w.exports,C={data:function(){return{allflag:!0,forgetshow:!1,registshow:!1,leaveshow:!1}},methods:{login:function(){this.allflag=!1,this.leaveshow=!0}},components:{leave:g},mounted:function(){c()}},y=C,b=(a("8cdf"),Object(f["a"])(y,o,r,!1,null,"abcc15fc",null)),_=b.exports,x=function(){var t=this,e=t.$createElement;t._self._c;return t._m(0)},E=[function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",[a("div",{attrs:{id:"container"}})])}],S=a("bd86");a("ac6a");function I(){var t=new BMap.Map("container"),e=new BMap.Point(120.030551,30.223874);t.centerAndZoom(e,17),t.enableScrollWheelZoom();var a=[{lng:120.030551,lat:30.223874,count:5},{lng:120.030551,lat:30.223765,count:5},{lng:120.030551,lat:30.223656,count:5},{lng:120.030551,lat:30.223444,count:5},{lng:120.031551,lat:30.223824,count:5},{lng:120.032551,lat:30.223844,count:5}];i()||alert("热力图目前只支持有canvas支持的浏览器,您所使用的浏览器不能使用热力图功能~");var n=new BMapLib.HeatmapOverlay({radius:20});function s(){n.show()}function i(){var t=document.createElement("canvas");return!(!t.getContext||!t.getContext("2d"))}t.addOverlay(n),n.setDataSet({data:a,max:14}),s()}var M=(h={data:function(){return{}},methods:{}},Object(S["a"])(h,"methods",{}),Object(S["a"])(h,"mounted",function(){I()}),h),B=M,k=(a("ceba"),Object(f["a"])(B,x,E,!1,null,"23ecd1e0",null)),L=k.exports,A=a("8c4f");n["a"].use(A["a"]);var z=new A["a"]({mode:"history",base:"",routes:[]}),D={data:function(){return{}},components:{index:_,bmap:L},router:z},P=D,O=Object(f["a"])(P,s,i,!1,null,"28243c2e",null),j=O.exports;n["a"].config.productionTip=!1,new n["a"]({router:z,render:function(t){return t(j)}}).$mount("#app")},"711f":function(t,e,a){var n,s=a("ec3f");"string"===typeof s&&(s=[[t.i,s,""]]);var i={hmr:!0};i.transform=n,i.insertInto=void 0;a("6844")(s,i);s.locals&&(t.exports=s.locals)},"835e":function(t,e,a){t.exports=a.p+"public/img/icon-student.a8334e5d.png"},"8cdf":function(t,e,a){"use strict";var n=a("05d3"),s=a.n(n);s.a},a905:function(t,e,a){},bd92:function(t,e,a){},ceba:function(t,e,a){"use strict";var n=a("711f"),s=a.n(n);s.a},ec3f:function(t,e,a){},f46e:function(t,e,a){}});
//# sourceMappingURL=index.12337c6f.js.map