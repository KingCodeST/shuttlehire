package za.ac.cput.repository.vehicle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.vehicle.Bus;
@Repository
public interface BusRepository extends JpaRepository<Bus,String> {
}
