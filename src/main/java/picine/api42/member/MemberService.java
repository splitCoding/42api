package picine.api42.member;

public interface MemberService {
    
    void join(Member member);

    Member findById(Long memberId);
}
