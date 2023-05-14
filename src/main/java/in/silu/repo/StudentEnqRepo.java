package in.silu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.silu.entity.StudentEnqEntity;

public interface StudentEnqRepo extends JpaRepository<StudentEnqEntity, Integer> {

}
