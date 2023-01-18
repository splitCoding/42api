package picine.api42.member;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl(new MemoryMemberRepository());

    @ParameterizedTest
    @ValueSource(longs = {1L, 2L, 3L})
    void join(Long memberId) {
        //given
        Member member = new Member(memberId, "sangheyp", Grade.Cadet);

        //when
        memberService.join(member);

        //then
        Member findMember = memberService.findById(memberId);
        assertThat(member).isEqualTo(findMember);
    }
}