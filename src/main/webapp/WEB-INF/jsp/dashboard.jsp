<jsp:include page="${request.contextPath}/after_login_header" />
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
    <script type="text/javascript">
window.alert(${message})
</script>
    <!-- breadcrumbs -->
	<div class="breadcrumbs">
		<div class="container">
			<div class="w3l_breadcrumbs_left">
				<ul>
					<li><a href="index.jsp">Home</a><i>/</i></li>
					<li>Dashboard</li>
				</ul>
			</div>
			<div class="w3_agile_breadcrumbs_right">
				<h2>Welcome To Dashboard.</h2>
				<p>${user}</p>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
	
<!-- //breadcrumbs -->
<div class="latest-albums">
		<div class="container">
			<h3 class="agileits_w3layouts_head"><span>Take Control over your Profile</span></h3>
            <p class="w3_agileits_para"><a href="${request.contextPath}/Password_Reset?user=${message}" class="w3-button w3-black">Change Password.</a></p>
            <div class="wthree_latest_albums_grids gallery">
				<div class="col-md-8 agile_mail_grid_left">
					<form action="UpdateUser" method="post">
                        Github Username:
                        <input type="text" name="git" value="${git}" readonly>
                        Email:
						<input type="text" name="email" value="${user}" readonly>
						<input type="submit" value="Edit Details" name="submit1" >

					</form>
				</div>
            </div>
    </div>
</div>
<jsp:include page="${request.contextPath}/footer" />