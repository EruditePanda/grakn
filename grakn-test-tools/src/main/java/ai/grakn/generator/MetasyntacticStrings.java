/*
 * Grakn - A Distributed Semantic Database
 * Copyright (C) 2016-2018 Grakn Labs Limited
 *
 * Grakn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Grakn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Grakn. If not, see <http://www.gnu.org/licenses/gpl.txt>.
 */

package ai.grakn.generator;

import com.google.common.collect.ImmutableList;

/**
 * Generator for producing a limited set of readable, meaningless strings.
 *
 * @author Felix Chapman
 */
public class MetasyntacticStrings extends AbstractGenerator<String> {
    public MetasyntacticStrings() {
        super(String.class);
    }

    @Override
    protected String generate() {
        return random.choose(ImmutableList.of(
                "foo", "bar", "baz", "qux", "quux", "corge", "grault",
                "garply", "waldo", "fred", "plugh", "xyzzy", "thud"
        ));
    }
}
