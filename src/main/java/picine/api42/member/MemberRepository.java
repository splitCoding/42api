package picine.api42.member;

public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberId);
}
