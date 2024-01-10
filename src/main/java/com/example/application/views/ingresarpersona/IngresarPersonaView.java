package com.example.application.views.ingresarpersona;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("Ingresar Persona")
@Route(value = "my-view", layout = MainLayout.class)
@Uses(Icon.class)
public class IngresarPersonaView extends Composite<VerticalLayout> {

    public IngresarPersonaView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        Hr hr = new Hr();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        Checkbox checkbox = new Checkbox();
        Checkbox checkbox2 = new Checkbox();
        Hr hr2 = new Hr();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonPrimary2 = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("95px");
        textField.setLabel("Nombre");
        textField.setWidth("min-content");
        textField.setHeight("91px");
        textField2.setLabel("Edad");
        textField2.setWidth("min-content");
        textField2.setHeight("91px");
        layoutColumn2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("100%");
        layoutColumn2.setHeight("103px");
        checkbox.setLabel("Estudiante");
        checkbox.setWidth("min-content");
        checkbox2.setLabel("Profesor");
        checkbox2.setWidth("min-content");
        layoutRow2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        buttonPrimary.setText("Guardar");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary2.setText("Cancelar");
        buttonPrimary2.setWidth("min-content");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(layoutRow);
        layoutRow.add(textField);
        layoutRow.add(textField2);
        getContent().add(hr);
        getContent().add(layoutColumn2);
        layoutColumn2.add(checkbox);
        layoutColumn2.add(checkbox2);
        getContent().add(hr2);
        getContent().add(layoutRow2);
        layoutRow2.add(buttonPrimary);
        layoutRow2.add(buttonPrimary2);
    }
}
