<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
 
<title>Home</title>
    <%@include file="./common_resource.jsp"%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/home.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/pHVolatileChart.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/pHFixedChart.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/QualityCountPieChart.js"></script>
	<script src="https://code.highcharts.com/highcharts.js"></script>
	<script src="https://code.highcharts.com/modules/exporting.js"></script>
	<script src="https://code.highcharts.com/modules/export-data.js"></script>
	<script src="https://code.highcharts.com/modules/accessibility.js"></script>

    <link href="${pageContext.request.contextPath}/resources/css/home.css" rel="stylesheet" />
    <%-- <link href="${pageContext.request.contextPath}/resources/css/chart.css" rel="stylesheet" /> --%>
</head>
<body>
	<figure class="highcharts-figure">
	    <div id="qualityCountContainer"></div>
	    <p class="highcharts-description">
	        It is a pie chart to confirm the percentage of each quality.  
	    </p>
	</figure>
	<figure class="highcharts-figure">
    <div id="pHFixedContainer"></div>
    <p class="highcharts-description">
    	This scatter plot chart is visualizing the pH and fixed acidity relationship. 
    	And You can also confirm the distribution of each quality.
        Scatter charts are often used to visualize the relationships
        between data in two dimensions.
    </p>
	</figure>
	<figure class="highcharts-figure">
    <div id="pHVolatileContainer"></div>
    <p class="highcharts-description">
        This scatter plot chart is visualizing the pH and volatile acidity relationship. 
    	And You can also confirm the distribution of each quality.
        Scatter charts are often used to visualize the relationships
        between data in two dimensions.
    </p>
	</figure>
    <h1>Wine Information Table!</h1>
    
     <button id = "load_wineQualityList" type = "button">Get Wine Info</button>
    <table>
        <thead>
            <tr>
                <th>Quality</th>
                <th>pH</th>
                <th>Fixed Acidity</th>
            </tr>
        </thead>
        <tbody id ="wineQualityList" >
            <!--<c:forEach items="${movieList}" var="movie">
                <tr>
                    <td>${movie.movie_name}</td>
                    <td>${movie.director}</td>
                    <td>${movie.types}</td>
                </tr>
            </c:forEach>-->
        </tbody>
    </table>
</body>
</html>
