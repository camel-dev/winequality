// Vanilla JS
document.addEventListener('DOMContentLoaded', function() {
	  // code
	load_wineQualitylist();
});

// jQuery
/*$( document ).ready(function() {
    load_movielist();
});*/

function load_wineQualitylist() {
	var wineQualityList;
	var html;

	// Vanilla JS
	document.getElementById('load_wineQualityList').addEventListener('click', function() {
	// Jquery 
	// $("#load_movieList").click(function(){  
				
		
				// Vanilla JS
				var url = "/springchart/restex";

				var beforeSend = function() {
					var wrap = document.getElementById('wineQualityList')
					while (wrap.firstChild)
						wrap.removeChild(wrap.firstChild)
				}

				var xhr = new XMLHttpRequest();
				xhr.onreadystatechange = function() {
					if (xhr.readyState === 4) {
						if (xhr.status === 200) {
							console.log(xhr.responseText);
							wineQualityList = JSON.parse(xhr.responseText);

							for (var i = 0; i < wineQualityList.length; i++) {

								var tr = document.createElement('tr');
								var td1 = document.createElement('td');
								td1.innerHTML = wineQualityList[i].quality;
								tr.appendChild(td1);

								var td2 = document.createElement('td');
								td2.innerHTML = wineQualityList[i].pH;
								tr.appendChild(td2);

								var td3 = document.createElement('td');
								td3.innerHTML = wineQualityList[i].fixed_acidity;
								tr.appendChild(td3);

								document.getElementById('wineQualityList')
										.appendChild(tr);

							}

						} else alert(xhr.responseText);
					}
				}

				xhr.open("POST", url, true);
				xhr.setRequestHeader("Content-Type", "application/json");
				beforeSend();
				xhr.send(null);
				
				
				/*--------------------------------------------------------------------------*/
				// Jquery
				
				/*$.ajax({      
				 	type:"POST",  
				    url:url,      
				   data:params,      
				    success:function(args){
				        movieList = args;
				        for(var i=0;i<args.length;i++){
				            html = "<tr>"
				                    + "<td>" + args[i].movie_name + "</td>" 
				                    + "<td>" + args[i].director + "</td>"
				                    + "<td>" + args[i].types + "</td>"
				                    "</tr>";
				            $("#movieList").append(html);    
				        }
				        
				        
				        console.log(args);
				    },   
				    beforeSend:function(){
				        $("#movieList").empty();  
				    },
				    error:function(e){  
				        alert(e.responseText);  
				    }  
				});  */

	});

}








