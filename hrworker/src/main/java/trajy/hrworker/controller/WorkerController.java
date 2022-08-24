package trajy.hrworker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trajy.hrworker.model.Worker;
import trajy.hrworker.repository.WorkerRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(WorkerController.class);

    @Value("${test.config}")
    private String testConfig;

    @Autowired
    Environment env;

    @Autowired
    private WorkerRepository repository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {
        LOGGER.info("Resquested from this instance, port: {}", env.getProperty("local.server.port"));
        Optional<Worker> optional = repository.findById(id);
        return optional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> workers = repository.findAll();
        return ResponseEntity.ok(workers);
    }

    @GetMapping(value = "/configs")
    public ResponseEntity<String> getConfig() {
        LOGGER.info("Resquested from this instance, port: {}", testConfig);
        return ResponseEntity.ok(testConfig);
    }
}
