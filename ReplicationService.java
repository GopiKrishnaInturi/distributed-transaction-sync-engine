package syncengine;

import org.springframework.stereotype.Service;

@Service
public class ReplicationService {

    public String startReplication() {
        return "Replication workflow started";
    }
}