<h2>1</h2>

- 요청 :  <br>http://localhost:8080/member/login?username=user1&password=1234 
- 응답 : <br>{<br>"resultCode": "S-1", <br>
  "msg": "user1 님 환영합니다."<br>
}<br><br>
- 요청 :  <br>http://localhost:8080/member/login?username=user1&password=12345
- 응답 : <br>{<br>"resultCode": "F-1", <br>
  "msg": "비밀번호가 일치하지 않습니다."<br>
  }<br><br>
- 요청 :  <br>http://localhost:8080/member/login?username=user2&password=1234
- 응답 : "resultCode": "F-2", <br>
  "msg": "user2(은)는 존재하지 않는 회원입니다."<br>
  }<br><br>