package com.krishna.app.kaiburr.Controller;
import com.krishna.app.kaiburr.Model.Data;
import com.krishna.app.kaiburr.Repo.dataRepo;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ApiController {
    @Autowired
    private  dataRepo dataRepo;
    @GetMapping(value="/")
    public List<Data> getData(){
        return dataRepo.findAll();
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Data> getDataById(@PathVariable long id) {
        Optional<Data> data = dataRepo.findById(id);
        if (!data.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(data.get());
    }

    @GetMapping("/servers/{name}")
    public ResponseEntity<List<Data>> getServersByName(@PathVariable String name) {
        List<Data> servers = dataRepo.findAllByNameContaining(name);

        if (servers.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(servers);
    }
    @PostMapping(value ="/send")
    public String saveData(@RequestBody Data d)
    {
        dataRepo.save(d);
        return "Data saved to database...";
    }
    @PutMapping(value ="/update/{id}")
    public String updateData(@PathVariable long id, @RequestBody @NotNull Data d)
    {
        Data updateData = dataRepo.findById(id).get();
        updateData.setName(d.getName());
        updateData.setLanguage(d.getLanguage());
        updateData.setFramework(d.getFramework());
        return "Data is updated";
    }
    @DeleteMapping(value="/delete/{id}")
    public String deleteUser(@PathVariable long id)
    {
        Data deleteUser = dataRepo.findById(id).get();
        dataRepo.delete(deleteUser);
        return "Delete user with the id..."+id;
    }
}
