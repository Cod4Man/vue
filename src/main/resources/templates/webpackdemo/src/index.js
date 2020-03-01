import $ from 'jquery';
import './css/test.css'

$(function () {
   $('li:odd').css('backgroundColor','yellow');
   $('li:even').css('backgroundColor','pink');
});