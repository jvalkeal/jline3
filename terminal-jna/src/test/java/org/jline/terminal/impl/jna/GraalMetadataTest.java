package org.jline.terminal.impl.jna;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;
import org.junit.Test;

public class GraalMetadataTest {

	@Test
	public void test1() throws IOException {
		Terminal terminal = TerminalBuilder.terminal();
		assertNotNull(terminal);
	}
}
