function calc(val)
{
	var x=document.getElementById('expression');

	if(val=="AC"){
		x.value="";
		console.log(x.value);
	}

	else{
		x.value+=val;
		console.log(x.value);
	}

}
// function log(val)
// {
// 	var x=document.getElementById('expression');
// 	x.value=val;
// }




