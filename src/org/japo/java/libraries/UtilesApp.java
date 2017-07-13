/*
 * Copyright 2017 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

import java.io.FileReader;
import java.util.Properties;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class UtilesApp {

    // Fichero Propiedades > Objeto Propiedades
    public static Properties cargarPropiedades(String rutaFichero) {
        // Objeto de Propiedades Vacio
        Properties prp = new Properties();

        // Cargar Fichero de Propiedades 
        try (FileReader fr = new FileReader(rutaFichero)) {
            prp.load(fr);
        } catch (Exception e) {
            System.out.println(e);
        }

        // Devolver Propiedades
        return prp;
    }
}
