package br.edu.ifsul.modelo;

import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-04-13T22:36:53", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Pet.class)
public class Pet_ { 

    public static volatile SingularAttribute<Pet, String> especie;
    public static volatile SingularAttribute<Pet, Calendar> nascimento;
    public static volatile SingularAttribute<Pet, Double> peso;
    public static volatile SingularAttribute<Pet, String> nome;
    public static volatile SingularAttribute<Pet, Integer> id;

}