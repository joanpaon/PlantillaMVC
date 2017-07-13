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
package org.japo.java.controllers;

import java.util.Properties;
import org.japo.java.libraries.UtilesApp;
import org.japo.java.libraries.UtilesSwing;
import org.japo.java.models.Model;
import org.japo.java.views.View;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class Controller {

    // Referencias
    private final Model model;
    private final View view;
    private final Properties prpApp;

    public Controller(Model model, View view) {
        // Memorizar Referencias
        this.model = model;
        this.view = view;

        // Cargar Propiedades Aplicación
        prpApp = UtilesApp.cargarPropiedades("app.properties");
    }

    // Propiedades Vista > Estado Vista
    public void restaurarEstadoVista(View view, Properties prp) {
        // Establecer Favicon
        UtilesSwing.establecerFavicon(view, "img/favicon.png");
    }

    // Modelo > Vista
    public void sincronizarModeloVista(Model model, View view) {
        
    }
}
