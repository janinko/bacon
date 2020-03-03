/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jboss.pnc.bacon.pnc;

import org.aesh.command.AeshCommandRuntimeBuilder;
import org.aesh.command.CommandException;
import org.aesh.command.CommandNotFoundException;
import org.aesh.command.CommandRuntime;
import org.aesh.command.impl.registry.AeshCommandRegistryBuilder;
import org.aesh.command.parser.CommandLineParserException;
import org.aesh.command.registry.CommandRegistry;
import org.aesh.command.registry.CommandRegistryException;
import org.aesh.command.validator.CommandValidatorException;
import org.aesh.command.validator.OptionValidatorException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 *
 * @author Honza Brázdil &lt;jbrazdil@redhat.com&gt;
 */
public class TestTheTest {

    @Test
    public void testVoid() throws CommandRegistryException, CommandNotFoundException, CommandLineParserException,
            OptionValidatorException, CommandValidatorException, CommandException, InterruptedException, IOException {

        CommandRegistry registry = AeshCommandRegistryBuilder.builder().command(Pnc.class).create();

        CommandRuntime runtime = AeshCommandRuntimeBuilder.builder().commandRegistry(registry).build();

        runtime.executeCommand("pnc project list");
    }

}
