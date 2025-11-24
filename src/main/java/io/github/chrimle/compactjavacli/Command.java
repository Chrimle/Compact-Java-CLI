package io.github.chrimle.compactjavacli;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * A <em>method</em> may be annotated with <em>this</em> annotation.
 *
 * @since 0.1.0
 * @author Chrimle
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface Command {}
