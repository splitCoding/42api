package picine.api42.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    //동시성 이슈를 생각한다면 ConcurrentHashMap 사용해야 함
    private static Map<Long, Member> repository = new HashMap<>();

    @Override
    public void save(Member member) {
        repository.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return repository.get(memberId);
    }
}

/*
오류 처리가 전혀 되어있지 않은 상태
 */