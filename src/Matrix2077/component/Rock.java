package Matrix2077.component;

import Matrix2077.model.Element;

public class Rock extends Element {

    final char type = '▲';

    public Rock(final int x, final int y) {
        super(x, y);
        super.setType(this.type);
    }
}
