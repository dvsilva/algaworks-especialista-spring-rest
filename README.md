# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 04-39-conhecendo-o-nivel-3
git add .
git commit -m "Conhecendo o nível 3 do RMM"
git push origin 04-39-conhecendo-o-nivel-3

git checkout master
git merge --no-ff 04-39-conhecendo-o-nivel-3
git push

sair da tela de merge
aperte "ESC" depois digite ":wq"
configure other merge tool
git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"

// delete branch locally
git branch -d localBranchName

// delete branch remotely
git push origin --delete remoteBranchName
```