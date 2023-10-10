package org.zerock.myapp.domain;

import lombok.extern.log4j.Log4j2;
<<<<<<< HEAD
=======
import org.assertj.core.api.Assertions;
>>>>>>> d0d0fe1ca36811be60d96f6b56c32c011065d4be
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.transaction.annotation.Transactional;
<<<<<<< HEAD
import org.zerock.myapp.domain.member.MemberVO;
=======
>>>>>>> d0d0fe1ca36811be60d96f6b56c32c011065d4be
import org.zerock.myapp.repository.MemberMabtisXmlDAO;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Log4j2
@Transactional
class MemberMabtisXmlDAOTest {

    private MemberMabtisXmlDAO dao;

    @BeforeEach
    void beforeEach(){
        this.dao = new MemberMabtisXmlDAO();
    }

    @Test
    @DisplayName("전체 멤버 출력")
    void testselectAll(){
        List<MemberVO> list = dao.selectAll();

        list.forEach(log::info);
    }

    @Test
    @DisplayName("아이디 찾기")
    void testFindById(){

        String name = "관리자";
        String phone = "010-1111-2222";

        String memberId = dao.findById(name, phone);

        assertThat(memberId).isEqualTo("admin");
        log.info("\t+ memberId : {}", memberId);

    }

}