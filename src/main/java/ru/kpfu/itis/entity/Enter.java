package ru.kpfu.itis.entity;

public class Enter {
    private Long id;
    private Long userId;
    private boolean success;

    public Enter(Long id, Long userId, boolean success) {
        this.id = id;
        this.userId = userId;
        this.success = success;
    }

    public Enter(Long userId, boolean success) {
        this.userId = userId;
        this.success = success;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public boolean isSuccess() {
        return success;
    }
}
