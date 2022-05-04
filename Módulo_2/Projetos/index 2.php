<html>
	https://jqueryui.com/
	
	<head>
		<title> Meu primeiro site em PHP! Woohoo!</title>
		////importar a biblioteca do jquery <br></br>
		<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script> 
		
		<style type="text/css">
			.linha {
				font-weight: bold;
				color: green;
				padding-left: 10px;
				line-height: 50px;
			}
		</style>
	</head>
	
	<body>
	
		<?php	
			for ( $i = 0 ; $i <10 ; $i++ ) {
				print( "<span class=\"linha\">Linha número " . $i . "</span><br />");
				}
		?>
	</body>
////carrega a página inteira e depois executa o que ta dentro do alert
	<script type="text/javascript">
		$(document).ready(function() {  
			alert("Woohoo!");
		});
	</script>

</html>	

	