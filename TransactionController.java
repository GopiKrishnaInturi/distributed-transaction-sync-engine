package syncengine;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TransactionController {

    private final ReplicationService replicationService;

    public TransactionController(ReplicationService replicationService) {
        this.replicationService = replicationService;
    }

    @PostMapping("/transactions")
    public String createTransaction(@RequestBody TransactionPayload payload) {
        return "Transaction accepted";
    }

    @PostMapping("/replication/start")
    public String startReplication() {
        return replicationService.startReplication();
    }

    @GetMapping("/replication/status")
    public String status() {
        return "Synchronization healthy";
    }

    @GetMapping("/health")
    public String health() {
        return "Running";
    }
}