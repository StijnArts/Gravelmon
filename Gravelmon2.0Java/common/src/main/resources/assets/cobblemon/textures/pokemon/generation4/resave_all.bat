@echo off
setlocal enabledelayedexpansion

:: Path to Aseprite executable
set ASEPRITE_PATH="C:\Program Files (x86)\Steam\steamapps\common\Aseprite\Aseprite.exe"

:: Get the current directory where the script is located
set SCRIPT_DIR=%~dp0

:: Process each .png file in the current directory and all subdirectories
for /R "%SCRIPT_DIR%" %%f in (*.png) do (
    echo Processing "%%f"
    %ASEPRITE_PATH% -b "%%f" --save-as "%%~dpnf.png"
    if !errorlevel! equ 0 (
        echo Saved: "%%~dpnf.png"
    ) else (
        echo Error processing "%%f"
    )
)

endlocal
pause
