package io.quarkus.extest.runtime.config;

import java.util.Optional;

import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;

@ConfigMapping(prefix = "quarkus.mapping.rt")
@ConfigRoot(phase = ConfigPhase.RUN_TIME)
public interface TestMappingRunTime {
    /**
     * A String value.
     */
    String value();

    /**
     * A nested Group.
     */
    Group group();

    /** Record values from env test **/
    Optional<String> record();

    /** Record values with named profile **/
    Optional<String> recordProfiled();

    interface Group {
        /**
         * A Group value.
         */
        String value();
    }
}
