package com.world.alfs.domain.member.repository;

import com.world.alfs.domain.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {

    Optional<Member> findByIdentifierAndPassword(String identifier, String password);

    Optional<Member> findByIdentifier(String identifier);

    Optional<Member> findByEmail(String email);

    Optional<Member> findByPhoneNumber(String phoneNumber);
}
