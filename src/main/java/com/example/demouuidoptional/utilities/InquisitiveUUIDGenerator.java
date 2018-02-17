package com.example.demouuidoptional.utilities;

import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.UUIDGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;

import java.io.Serializable;
import java.util.Properties;

/**
 * Based on http://stackoverflow.com/a/5392349/566434
 */
public class InquisitiveUUIDGenerator extends UUIDGenerator {

    private String entityName;

    @Override
    public void configure(Type type, Properties params, ServiceRegistry registry) {
        entityName = params.getProperty(ENTITY_NAME);
        super.configure(type, params, registry);
    }

    @Override
    public Serializable generate(SessionImplementor session, Object object) {
        Serializable id = session
                .getEntityPersister(entityName, object)
                .getIdentifier(object, session);

        if (id == null) {
            return super.generate(session, object);
        } else {
            return id;
        }
    }
}