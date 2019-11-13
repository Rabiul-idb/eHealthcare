<jsp:include page="header.jsp"></jsp:include>

<section style="margin-top: 160px;">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8">
				<h2 class="text-center ">Make your Online Appointment</h2>
				<hr/>
				<form action="/onlineAppoint" method="post">
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputPassword4">Patient Name</label> 
							<input
								type="text" class="form-control" id="inputPassword4"
							name="pName" placeholder="Patient Name">
						</div>
						<div class="form-group col-md-6">
							<label for="inputEmail4">Email</label> <input type="email" name="pEmail"
								class="form-control" id="inputEmail4" placeholder="Email">
						</div>
						
					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputPassword5">Patient Age</label> <input name="pAge"
								type="text" class="form-control" id="inputPassword5"
								placeholder="Patient Age">
						</div>
						<div class="form-group col-md-6">
							<label for="inputState">Gender</label> 
							<select id="inputState" name="pGender"
								class="form-control">
								<option selected>Male</option>
								<option>Female</option>
							</select>
						</div>
						
					</div>
					<div class="form-group">
						<label for="inputAddress">Address</label> <input type="text" name="pAddress"
							class="form-control" id="inputAddress" placeholder="1234 Main St">
					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputState">Department</label> 
							<select id="inputState" name="pDepertment"
								class="form-control">
								<option selected>Neurology</option>
								<option>Dental</option>
								<option>Cardiology</option>
								<option>Psycology</option>
								<option>Gynee & Obs</option>
							</select>
						</div>
						<div class="form-group col-md-6">
							<label for="inputState1">Doctor</label> 
							<select id="inputState1" name="pDoctor"
								class="form-control">
								<option selected>Rothi</option>
								<option>Abdul Alim</option>
								<option>Abdullah Asif</option>
								<option>Enamul Haque</option>
								<option>Rabiul Islam</option>
							</select>
						</div>
						
					</div>
					
					
					<div class="form-group">
						<div class="form-check">
							<input class="form-check-input" type="checkbox" id="gridCheck">
							<label class="form-check-label" for="gridCheck"> Accept terms and condition
								 </label>
						</div>
					</div>
					<div class="form-group col-md-6">
							<label for="inputEmail6">Token No</label> <input type="text"  name="token"
								class="form-control" id="inputEmail6" placeholder="" value="${random}">
						</div>
					<button type="submit" class="btn btn-primary pull-right">Submit</button>
				</form>
				<h2 class="text-success">${msg}</h2>
			</div>
		</div>
	</div>
</section>

<jsp:include page="footer.jsp"></jsp:include>
<script>
	alert("Check your email and get appointment by token Number. your Token number is "+token);
</script>