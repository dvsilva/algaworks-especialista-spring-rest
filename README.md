# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 05-11-implementando-um-repositorio-sdj-customizado
git add .
git commit -m "Implementando um repositório SDJ customizado"
git push origin 05-11-implementando-um-repositorio-sdj-customizado

git checkout master
git merge --no-ff 05-11-implementando-um-repositorio-sdj-customizado
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