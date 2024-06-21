package com.iesam.edbooking.Reserva.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.edbooking.Reserva
.domain.Reserva
;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ReservaFileLocalDataSource {

    private String nameFile = "Reserva .txt";

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Reserva
>>() {
    }.getType();

    public void save(Reserva
 Reserva
) {
        List<Reserva
> models = findAll();
        models.add(Reserva
);
        saveToFile(models);
    }

    public void saveList(List<Reserva
> models) {
        saveToFile(models);
    }

    private void saveToFile(List<Reserva
> models) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(models));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la informaciÃ³n.");
            e.printStackTrace();
        }
    }

    public Reserva findById(String idReserva) {
        List<Reserva> models = findAll();
        for (Reserva model : models) {
            if (Objects.equals(model.getIdReserva(), idReserva)) {
                return model;
            }
        }
        return null;
    }

    public List<Reserva> findAll() {
        try {
            File myObj = new File(nameFile);
            if (!myObj.exists()) {
                myObj.createNewFile();
            }
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error al obtener el listado.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear el fichero.");
            throw new RuntimeException(e);
        }
        return new ArrayList<>();
    }

    public void delete(String idReserva) {
        List<Reserva> newList = new ArrayList<>();
        List<Reserva> models = findAll();
        for (Reserva model : models) {
            if (model.getIdReserva() != idReserva) {
                newList.add(model);
            }
        }
        saveList(newList);
    }
}
