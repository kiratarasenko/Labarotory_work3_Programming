public record Lake(int depth, boolean isBeauty) {
    @Override
    public int hashCode() {
        return (Integer.hashCode(depth) * 2);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || getClass() != other.getClass() || this.hashCode() != other.hashCode()) {
            return false;
        }
        Lake obj = (Lake) other;
        return depth == obj.depth && isBeauty == obj.isBeauty;
    }

}
