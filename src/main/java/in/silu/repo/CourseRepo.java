package in.silu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.silu.entity.CourseEntity;

public interface CourseRepo extends JpaRepository<CourseEntity, Integer> {

}
