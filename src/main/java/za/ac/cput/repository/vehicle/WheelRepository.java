package za.ac.cput.repository.vehicle;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.vehicle.Wheel;

public interface WheelRepository extends JpaRepository<Wheel,String> {
}
