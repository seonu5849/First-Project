package org.zerock.myapp.service.member;

<<<<<<< HEAD
import org.zerock.myapp.domain.member.MemberDTO;
import org.zerock.myapp.domain.member.MemberVO;
=======
import org.zerock.myapp.domain.MemberDTO;
import org.zerock.myapp.domain.MemberVO;
>>>>>>> d0d0fe1ca36811be60d96f6b56c32c011065d4be

import java.util.List;

public interface MemberService {

    public abstract String findById(String name, String phone); // 아이디 찾기
    public abstract String findByPasswd(String id);// 비밀번호찾기
    public abstract void login(MemberDTO dto);// 로그인
    public abstract void join(MemberDTO dto);// 회원가입
    public abstract List<MemberVO> memberInfo(String num);// 마이페이지

}
