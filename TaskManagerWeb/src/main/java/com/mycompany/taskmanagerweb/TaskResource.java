package com.mycompany.taskmanagerweb;

import com.mycompany.dao.TaskDAO;
import com.mycompany.taskmaneger.Task;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("tasks")
public class TaskResource {
    private TaskDAO taskDAO = new TaskDAO();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Task> getTasks() {
        return taskDAO.consultar();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Task getTask(@PathParam("id") int id) {
        List<Task> tasks = taskDAO.consultar();
        return tasks.stream().filter(task -> task.getId() == id).findFirst().orElse(null);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addTask(Task task) {
        taskDAO.inserir(task);
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("{id}")
    public Response deleteTask(@PathParam("id") int id) {
        taskDAO.excluir(id);
        return Response.status(Response.Status.NO_CONTENT).build();
    }
}
