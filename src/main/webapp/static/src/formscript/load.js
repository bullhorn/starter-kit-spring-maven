var body = document.getElementById('bhBody');

var width = body.offsetWidth;
var height = body.offsetHeight;

var block = document.createElement('div');

block.id = 'block-form-script';

block.style.position = 'absolute';
block.style.top = '0';
block.style.left = '0';
block.style.zIndex = '100';
block.style.width = width+'px';
block.style.height = height+'px';
block.style.backgroundColor = 'rgba(192, 192, 192, 0.5)';

body.appendChild(block);