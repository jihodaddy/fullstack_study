/**
 *  checkForm.js : 폼 유효성 확인
 */

window.onload = function(){
	//id가 joinForm인 폼의 submit 버튼이 눌러졌을 때 수행되는 이벤트 처리
	document.getElementById('joinForm').onsubmit = function(){
		
		//성명을 입력하지 않은 경우 경고창 출력
		// id로 찾아와서
		var name = document.getElementById('name');
		
		//값이 비었는지 확인하고, 비었으면 경고창 출력, 입력란에 포커스 주고, 서버로 전송되지 않게 함(다음 페이지로 이동 못하게)
		if(name.value == ""){
			alert("성명을 입력하세요.");
			name.focus();
			return false; //서버로 전송되지 않게 함(다음 페이지로 이동 못하게)
		};
		
		//아이디 입력하지 않은 경우
		//"아이디를 입력하세요"출력, 아이디 입력란에 포커스
		var id = document.getElementById('id');
		
		if(id.value == ""){
			alert("ID를 입력하세요.");
			id.focus();
			return false; //서버로 전송되지 않게
		};		
		//아이디가 6~10자가 안되게 입력 하였을경우
		// "아이디는 6~10자로 입력하세요" 경고창 출력
		//아이디 입력란에 입력한 내용 삭제하고
		//아이디 입력란에 포커스
		if(6 > id.value || id.value > 10){	//(!(6 <= id.value && id.value <= 10))
			alert("아이디는 6~10자로 입력하세요");
			id.value =""; // null도 됨.
			id.focus();
			return false;
		}
		
		
		//비밀번호 입력하지 않은 경우
		var password = document.getElementById('password');
		
		if(password.value == ""){
			alert("비밀번호를 입력하세요.");
			password.focus();
			return false;
			};
			
		//"비밀번호"와 "비밀번호 확인"값이 일치하지 않는 경우
		// "비밀번호 확인이 일치하지 않습니다." 경고창 출력
		// '비밀번호 확인'입력란 값 지우고 , 포커스
		
		var passwordCheck = document.getElementById('passwordCheck');
		
		if(password.value != passwordCheck.value){
			alert("비밀번호 확인이 일치하지 않습니다.");
			passwordCheck.value = "	";
			passwordCheck.focus();
			return false;
			
		}
		/////////////////////////////////////////////////
		// 직업을 선택하지 않은경우
		// (1) 첫번째 <option> 태그에 빈값으로 지정한 경우: <option value=""> 직업선택	
		// "직업을 선택하세요" 경고창
		
	/*	var job = document.getElementById('job');
		
		if(job.selectedInDex == 0){
			alert("직업을 선택하세요.");
			return false;
		}*/
		
		//(2) value 값 사용
		var job = document.getElementById('job');
		
		if(job.valus == ""){
			alert("직업을 선택하세요.");
			return false;
		}
		
		// (3) <option> 태그 하느ㅏ를 미리 선택해 놓으면 유효성 확인 필요 없음
		// <option value "프로그래머" selected>프로그래머
		
		/////////////////////////////////////////////
		// '이메일 수신 여부' 라디오 버튼을 선택하지 않은 경우
		// 라디오 버튼의 경우 id속성을 사용하지 않고 그룹 이름인 name 속성 사용
		// 동일 그룸에 속한 여러 라디오 버튼(객체)은 동일 name: 배열로 처리
		// 배열의 각 원소를 하나씩 확인: checked 속성이 true면 체크된 상태/ false면 체크되지 않은 상태
		// for문 사용/ if문 사용
		
		//체크 상태 여부를 저장할 변수 선언
		var chk = false;
		for(var i=0; i<joinForm.emalRcv.length; i++){
			if(joinForm.emailRcv[i].checked == true)
			chk = true;	//하나라도 체크되면 treu값 저장
		}	// 하나도 체크되지 않으면 초기값 false가 그대로 유지
		
		// 하나도 선택하지 않으면
		if(chk == false){
			alert("이메일 수신 여부를 선택하세요");
			return false;
		}
		
		///////////////////////////////////////////
		// '동의' 체크박스를 하나도 선택하지 않은 경우
		// "동의에 체크하지 않았습니다." 경고창 출력
		var agreement1 = document.getElementById('agreement1');
		var agreement2 = document.getElementById('agreement2');
		
		if(agreement1.checked == false && agreement2.checked == false){
			alert('동의에 체크하지 않았습니다.');
			return false;
		} 
		
	}; //onsubmit 끝
};	// window.onload 끝





