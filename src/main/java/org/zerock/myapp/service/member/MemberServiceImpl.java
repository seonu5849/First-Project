package org.zerock.myapp.service.member;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.zerock.myapp.domain.member.MemberDTO;
import org.zerock.myapp.domain.member.MemberVO;
import org.zerock.myapp.repository.MemberDAO;

import java.util.List;

@Log4j2
@RequiredArgsConstructor

@Service
public class MemberServiceImpl implements MemberService{
    private final MemberDAO memberDAO;

    @Override
    public String findById(String name, String phone) {
        return null;
    }

    @Override
    public String findByPasswd(String id) {
        return null;
    }

    @Override
    public void login(MemberDTO dto) {

    }

    @Override
    public void join(MemberDTO dto) {

    }

    @Override
    public List<MemberVO> memberInfo(String num) {
        return null;
    }
}
